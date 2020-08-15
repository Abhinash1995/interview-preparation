package com.company.datastructure.queue;

import java.util.NoSuchElementException;

public class MyGenericQueue<X> {

    private X[] data;
    private int front;
    private int rear;

    public MyGenericQueue(int capacity) {
        data = (X[]) new Object[capacity];
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

    public void enqueue(X ele) {
        //check if queue is full
        if (rear == data.length) {
            System.out.println("Queue is full");
        }
        //check if any item added or not we can also check if size() == 0
        if (front == -1)
            front++; //if adding element for first time then increment front also
        data[++rear] = ele;
    }

    public X deQueue() {

        if (size() == 0) {
            System.out.println("Queue is Empty");
        }
        X item = data[front++];
        if (front >= rear)
            front = rear = -1; //if this is last item in the queue then queue needs to get reset to empty
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

    public X front() {//peek
        if (isEmpty()) {
            System.out.println("The Queue is empty");
            throw new NoSuchElementException("Queue is empty");
        } else {
            return data[front];
        }
    }

    public X rear() {
        if (isEmpty()) {
            System.out.println("The Queue is empty");
            throw new NoSuchElementException("Queue is empty");
        } else {
            return data[rear];
        }
    }

    public boolean contains(X item) {
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

    public X access(int pos) {
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
        for (int i = front; i < rear + 1; i++) {
            System.out.println(data[i]);
        }
    }


}
