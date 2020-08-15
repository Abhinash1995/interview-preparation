package com.company.datastructure.queue;

import java.util.NoSuchElementException;

public class MyQueue {

    private Object data[];
    private int front;
    private int rear;

    public MyQueue(int capacity) {
        data = new Object[capacity];
        front = -1;
        rear = -1;
    }

    //no of element in queue
    public int size() {
        //if queue is empty return 0
        if (front == -1 && rear == -1) {
            return 0;
        } else {
            //adding 1 o get inclusive size
            return rear - front + 1;
        }
        // +1 is as front and back start from -1 so actual size will be rear - front + 1
    }

    public void enqueue(Object ele) {
        //check if queue is full
        if (rear == data.length - 1) {
            System.out.println("Queue is full");
        }
        //check if any item added or not we can also check if size() == 0
        else if (front == -1) {
            //adding element for first time
            front++;
            rear++;
            data[rear] = ele;
        } else {
            rear++;
            data[rear] = ele;
        }
    }

    public Object deQueue() {
        Object item = null;
        if (front == -1) {
            System.out.println("Queue is Empty");
        }
        //if this is last item in the queue then queue needs to get reset to empty
        else if (front == rear) {
            item = data[front];
            front = -1;
            rear = -1;
        } else {
            item = data[front];
            front++;
        }
        return item;
    }

    boolean isEmpty() {
        return front == -1;
    }

    boolean isFull() {
        if (front == 0 && rear == (size() - 1))
            return true;
        else
            return false;
    }

    public Object front() {//peek
        if (isEmpty()) {
            System.out.println("The Queue is empty");
            throw new NoSuchElementException("Queue is empty");
        } else {
            return data[front];
        }
    }

    public Object rear() {
        if (isEmpty()) {
            System.out.println("The Queue is empty");
            throw new NoSuchElementException("Queue is empty");
        } else {
            return data[rear];
        }
    }

    public boolean contains(Object item) {
        boolean found = false;
        if (size() == 0) {
            return found;
        }
        for (int i = front; i < rear; i++) {
            if (data[i].equals(item)) {
                found = true;
                break;
            }
        }
        return found;
    }

    public Object access(int pos) {
        if (size() == 0 || pos > size()) {
            throw new IllegalArgumentException("No item in the queue or Position entered is greater");
        }
        int trueIndex = 0;
        for (int i = front; i < rear; i++) {
            if (trueIndex == pos) {
                return data[i];
            }
            trueIndex++;
        }
        System.out.println("Could not get queue element at position " + pos);
        return null;
    }

    public void printQueue(){
        for (int i = front; i < size(); i++) {
            System.out.println(data[i]);
        }
    }

}
