package com.company.chat;

import java.net.ServerSocket;
import java.net.Socket;

public class MultithreadSocket {

    public static void main(String[] args) throws Exception {
        try {
            ServerSocket server = new ServerSocket(8888);
            System.out.println("Server Started ....");
            while (true) {
                Socket serverClient = server.accept();
                ServerClientThread sct = new ServerClientThread(serverClient);
                sct.start();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
