package com.company.datastructure.stack;

import com.company.datastructure.linkedlist.single.MySingleLinkedList;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyLinkedListStack {

    private Node head;
    private int size;
    LinkedList<String> linkedList; //using java linked list
    int top = -1;

    private static class Node {
        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
        }
    }

    public void push(Object item){
        Node node = new Node(item);
        node.next = head;
        head = node;
        size++;
        //this method is similar to adding item at first in linked list  addFirst();
//        linkedList.push(); using java linked list
    }

    public Object pop(){
       if(isEmpty()){
           System.out.println("Stack UnderFlow...");
           return new EmptyStackException();
       }
        Node element = head;
        Object ele = element.data;
        head = head.next;
        size--;
        return ele;
        //this method is similar to removing first item  in linked list  removeFirst();
//        linkedList.pop(); using java linked list
    }

    public Object peek(){
        if(isEmpty()){
            System.out.println("Stack UnderFlow...");
            return new EmptyStackException();
        }
        return head.data;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void print(){
        Node current = head;
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
