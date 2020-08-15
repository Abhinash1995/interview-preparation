package com.company.datastructure.queue;


public class MainQueue {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(20);
        queue.enqueue("Ram");
        queue.enqueue("Shyam");
        queue.enqueue("Raja");
        queue.enqueue("Mohan");
        System.out.println(queue.size());
        System.out.println(queue.front());
        System.out.println(queue.rear());
        System.out.println(queue.contains("Ram"));
        System.out.println(queue.access(1));
        queue.printQueue();
        System.out.println();
        System.out.println(queue.deQueue());
        System.out.println(queue.size());
        System.out.println(queue.front());
        System.out.println(queue.rear());
        System.out.println(queue.contains("Ram"));
        System.out.println();
        queue.printQueue();

        MyGenericQueue<String> genericQueue = new MyGenericQueue<String>(20);
        genericQueue.enqueue("Ram");
        genericQueue.enqueue("Shyam");
        genericQueue.enqueue("Raja");
        genericQueue.enqueue("Mohan");
        System.out.println(genericQueue.size());
        System.out.println(genericQueue.front());
        System.out.println(genericQueue.rear());
        System.out.println(genericQueue.contains("Ram"));
        System.out.println(genericQueue.access(2));
        genericQueue.printQueue();
        System.out.println();
        System.out.println(genericQueue.deQueue());
        System.out.println(genericQueue.size());
        System.out.println(genericQueue.front());
        System.out.println(genericQueue.rear());
        System.out.println(genericQueue.contains("Ram"));
        genericQueue.printQueue();
    }
}
