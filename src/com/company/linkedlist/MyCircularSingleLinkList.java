package com.company.linkedlist;

public class MyCircularSingleLinkList {

    private Node first;
    private Node last;
    private int size;

    public MyCircularSingleLinkList(){
        first = null;
        last = null;
        size = 0;
    }

    private static class Node {
        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
        }
    }

    public int size() {
        return size;
    }

    public void addFirst(Object object) {
        Node node = new Node(object);
        node.next = first;
        first = node;
        if(size() == 0){
            last = first;
        }else {
            last.next = first;
        }

        size++;
    }

    public void addLast(Object object) {
        Node node = new Node(object);
        //this insure list is empty
        node.next = first;
        last.next = node;

        last = node;
        size++;
    }


    public void printList() {
        Node current = first;
        System.out.print("Head -> ");
        //if it reach null that means end of list
        while (size() != 0) {
            System.out.print(current.data);
            System.out.print(" -> ");
            //incrementing to next node
            current = current.next;
            size--;
        }
        System.out.println("Head");
    }
}
