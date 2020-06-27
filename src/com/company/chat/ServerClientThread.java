package com.company.chat;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerClientThread extends Thread {

    Socket serverClient;

    ServerClientThread(Socket inSocket) {
        serverClient = inSocket;
    }

    public void run() {
        try {

            DataInputStream inStream = new DataInputStream(serverClient.getInputStream());

            DataOutputStream outStream = new DataOutputStream(serverClient.getOutputStream());

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String clientMessage = "", serverMessage = "";
            String temp;
            while (!clientMessage.equals("bye")) {
                clientMessage = inStream.readUTF();
                System.out.println("waiting from server reply :");
                temp=clientMessage;
                System.out.println("From Client: " + temp);

                serverMessage = reader.readLine();
                outStream.writeUTF(serverMessage);
                outStream.flush();
            }
            inStream.close();
            outStream.close();
            serverClient.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
