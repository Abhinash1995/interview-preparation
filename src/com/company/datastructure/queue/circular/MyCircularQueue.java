package com.company.datastructure.queue.circular;

import java.util.Arrays;

public class MyCircularQueue {

    private Object data[];
    private int front;
    private int rear;
    int maxSize;
    int currentSize;

    public MyCircularQueue(int capacity) {
        data = new Object[capacity];
        front = -1;
        rear = -1;
        maxSize = capacity;
        currentSize = 0;
    }

    /**
     * Check if queue is full.
     */
    public boolean isFull() {
        //if we have already completed the circle then we can say queue is full
        if(rear + 1 == front){
            return true;
        }else if((front ==0) && rear + 1 == maxSize){//front is pointing at forst index and rear is pointing at last index
            return true;
        }else {
            return false;
        }
    }

    /**
     * Check if Queue is empty.
     */
    public boolean isEmpty() {
        return (rear == -1);
    }

    public void enqueue(Object ele) {
        //check if queue is full
        if (isFull()) {
            System.out.println("Queue is full");
        }else {
            if (rear + 1 == maxSize){//if rear is pointing at last index point it to first index
                rear = 0;
            }
            else{
                rear++;
            }
            if(front == -1)//if inserting fo rfirst time
                front++;
            data[rear] = ele;
        }
    }

//    /**
//     * Enqueue elements to rear.
//     */
//    public void enqueue(Object item){
//        //check if queue is full
//        if (isFull()) {
//            System.out.println("Queue is full");
//        }
//        else {
//            rear = (rear + 1) % data.length;
//            data[rear] = item;
//            currentSize++;
//
//            if (front == -1) {
//                front = rear;
//            }
//        }
//    }

    /**
     * Dequeue element from Front.
     */
    public Object dequeue() {
        Object deQueuedElement = null;
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        }
        //if this is last item in the queue then queue needs to get reset to empty
        else if (front == rear) {
            deQueuedElement = data[front];;
            front = -1;
            rear = -1;
        }
        else if(front + 1 == currentSize){//if start has reached end of array then start again from 0
            deQueuedElement = data[front];
            front = 0;
        }else {
            deQueuedElement = data[front];
            front++;
        }
        return deQueuedElement;
    }

//    public void printQueue(){
//        for (int i = front; i < rear + 1; i++) {
//            System.out.println(data[i]);
//        }
//    }
    @Override
    public String toString() {
        return "CircularQueue [" + Arrays.toString(data) + "]";
    }
}
