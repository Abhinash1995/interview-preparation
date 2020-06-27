package com.company.chat;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class TCPClient {

    public static void main(String[] args) throws Exception {
        try {
            Socket socket = new Socket("192.168.1.52", 8888);
            DataInputStream inStream = new DataInputStream(socket.getInputStream());
            DataOutputStream outStream = new DataOutputStream(socket.getOutputStream());
            //Scanner sc=new Scanner(socket.getInputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String clientMessage = "", serverMessage = "";
            while (!clientMessage.equals("bye")) {
                System.out.println("waiting from client input :");
                clientMessage = br.readLine();
                //String temp=sc.next();
                outStream.writeUTF(clientMessage);
                outStream.flush();
                serverMessage = inStream.readUTF();
                System.out.println("From server: " + serverMessage);
                //System.out.println("from client:" +temp);

            }
            outStream.close();
            outStream.close();
            socket.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
