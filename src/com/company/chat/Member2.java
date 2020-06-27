package com.company.chat;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketException;
import java.util.Scanner;

public class Member2
{
    private static final String TERMINATE = "Exit";
    static String name;
    static volatile boolean finished = false;
    public static void main(String[] args)
    {

        try
        {
            InetAddress group = InetAddress.getByName("239.0.0.0");
            int port = Integer.parseInt("1234");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your name: ");
            name = sc.nextLine();
            MulticastSocket socket = new MulticastSocket(port);

            // Since we are deploying
            socket.setTimeToLive(0);
            //this on localhost only (For a subnet set it as 1)

            socket.joinGroup(group);
            Thread t = new Thread(new
                    ReadThread(socket,group,port));

            // Spawn a thread for reading messages
            t.start();

            // sent to the current group
            System.out.println("Start typing messages...\n");
            while(true)
            {
                String message;
                message = sc.nextLine();
                if(message.equalsIgnoreCase(Member2.TERMINATE))
                {
                    finished = true;
                    socket.leaveGroup(group);
                    socket.close();
                    break;
                }
                message = name + ": " + message;
                byte[] buffer = message.getBytes();
                DatagramPacket datagram = new
                        DatagramPacket(buffer,buffer.length,group,port);
                socket.send(datagram);
            }
        }
        catch(SocketException se)
        {
            System.out.println("Error creating socket");
            se.printStackTrace();
        }
        catch(IOException ie)
        {
            System.out.println("Error reading/writing from/to socket");
            ie.printStackTrace();
        }
    }

}
class MemberThread2 implements Runnable
{
    private MulticastSocket socket;
    private InetAddress group;
    private int port;
    private static final int MAX_LEN = 1000;
    MemberThread2(MulticastSocket socket,InetAddress group,int port)
    {
        this.socket = socket;
        this.group = group;
        this.port = port;
    }

    @Override
    public void run()
    {
        while(!GroupChat.finished)
        {
            byte[] buffer = new byte[MemberThread2.MAX_LEN];
            DatagramPacket datagram = new
                    DatagramPacket(buffer,buffer.length,group,port);
            String message;
            try
            {
                socket.receive(datagram);
                message = new
                        String(buffer,0,datagram.getLength(),"UTF-8");
                if(!message.startsWith(GroupChat.name))
                    System.out.println(message);
            }
            catch(IOException e)
            {
                System.out.println("Socket closed!");
            }
        }
    }
}
