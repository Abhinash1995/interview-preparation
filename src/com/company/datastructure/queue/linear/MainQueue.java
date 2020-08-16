package com.company.datastructure.queue.linear;


//we can implement Queue, stack in many different way
//1. using array (Linear Queue)
//2. using array (Circular Queue)
//3. using Linked list (linear Queue) we do not have circular because deleted node will be garbage collected so no loss of space
//while implementing using ll we can also use already implemented ll (if not we can first write implements specific
//  method req for queue using linked list then we can use that method while implementing queue or
//  we can implement queue using ll directly at the end both are same directly)

public class MainQueue {
    public static void main(String[] args) {

        //Basic Queue
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
        System.out.println("-------------------------------");

        //Generic Queue
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
        System.out.println("-------------------------------");

        MyLinkedListQueue<String> linkedListQueue = new MyLinkedListQueue<>();
        linkedListQueue.enQueue("Ram");
        linkedListQueue.enQueue("Shyam");
        linkedListQueue.enQueue("Raja");
        linkedListQueue.enQueue("Mohan");
        System.out.println(linkedListQueue.size());
        System.out.println(linkedListQueue.peek());
        linkedListQueue.printQueue();
        System.out.println();
        System.out.println(linkedListQueue.deQueue());
        System.out.println(linkedListQueue.size());
        System.out.println(linkedListQueue.peek());
        linkedListQueue.printQueue();
        System.out.println("-------------------------------");



        LinkedListQueue queue1 = new LinkedListQueue();
        queue1.enQueue("Ram");
        queue1.enQueue("Shyam");
        queue1.enQueue("Raja");
        queue1.enQueue("Mohan");
        System.out.println(queue1.size());
        System.out.println(queue1.peek());
        queue1.printQueue();
        System.out.println();
        System.out.println(queue1.dequeue());
        System.out.println(queue1.size());
        System.out.println(queue1.peek());
        queue1.printQueue();
    }
}
