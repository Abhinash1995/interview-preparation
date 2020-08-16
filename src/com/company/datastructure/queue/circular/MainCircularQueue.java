package com.company.datastructure.queue.circular;

public class MainCircularQueue {

    public static void main(String[] args) {
        MyCircularQueue circularQueue = new MyCircularQueue(5);
        circularQueue.enqueue(10);
        circularQueue.enqueue(20);
        circularQueue.enqueue(30);
        circularQueue.enqueue(40);
        circularQueue.enqueue(50);
        System.out.println(circularQueue);
        System.out.println(circularQueue.dequeue());
        circularQueue.enqueue(23);
        System.out.println("---------------");
        System.out.println(circularQueue);

//        circularQueue.enqueue(20);
    }
}
