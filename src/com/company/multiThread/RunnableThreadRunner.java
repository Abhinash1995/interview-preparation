package com.company.multiThread;

public class RunnableThreadRunner {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread t = new Thread(runnable);
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("main thread");
        }
    }
}
