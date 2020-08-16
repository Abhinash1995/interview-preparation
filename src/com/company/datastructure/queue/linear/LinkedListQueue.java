package com.company.datastructure.queue.linear;

import com.company.datastructure.linkedlist.single.GenericLinkedList;

import java.util.NoSuchElementException;

public class LinkedListQueue {

    private class QNode {
        Object data;
        QNode next;

        // constructor to create a new linked list node
        public QNode(Object data) {
            this.data = data;
            this.next = null;
        }
    }

    QNode front, rear;  //like head and tail
    int size;

    public LinkedListQueue() {
        front = rear = null;
        size = 0;
    }

    // Method to add an key to the queue.
    void enQueue(Object data) {
        // Create a new LL node
        QNode node = new QNode(data);

        // If queue is empty, then new node is front and rear both
        if (rear == null) {
            front = rear = node;
            return;
        }
        // Add the new node at the end of queue and change rear
        rear.next = node;
        rear = node;
        size++;
    }

    public int size() {
        return size;
    }

    // Method to remove an key from queue.
    public Object dequeue() {
        // If queue is empty, return NULL.
        if (front == null)
            throw new IllegalStateException("the list is empty");

        QNode element = front;
        Object ele = element.data;
        front = front.next;
        if (size() == 1) {
            rear = null;
        }
        size--;
        return ele;
    }

    public boolean isEmpty()
    {
        return(front==null);
    }

    public Object peek() {
        final QNode f = front;
        if (f == null)
            throw new NoSuchElementException();
        return f.data;
    }

    public void printQueue() {
        QNode current = front;
        System.out.print("Head -> ");
        //if it reach null that means end of list
        while (current != null) {
            System.out.print(current.data);
            System.out.print(" -> ");
            //incrementing to next node
            current = current.next;
        }
        System.out.println("null");
    }
}
