package com.company.datastructure.linkedlist.single;


import java.util.LinkedList;
import java.util.NoSuchElementException;

public class MySingleLinkedList {

    private Node head;
    private Node last;
    private int size;

    public MySingleLinkedList() {
        head = null;
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
        node.next = head;
        head = node;
        //if it is first element then pointing last to first node itself
        if (size == 0) {
            last = head;
        }
        size++;
    }

    public void addLast(Object object) {
        Node node = new Node(object);
        //this insure list is empty
        if (last == null) {
            head = node;
            last = head;
        } else {
            last.next = node;
            node.next = null;
            last = node;
        }
        size++;
    }

    public void add(Object ele) {
        Node newNode = new Node(ele);
        //this condition means we are adding element for the first time
        if (head == null) {
            head = newNode;
            last = head;
        }
        //otherwise we need to grab the last node and update its value
        else {
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    public void insertAt(Object ele, int position) {
        if (size() < position) {
            throw new IndexOutOfBoundsException("the link list is smaller than the position you are trying ta add item");
        }
        //if trying to add at first position
        if (position == 0) {
            addFirst(ele);
        }
        Node currentNode = head;
        //start at 1 because we already on first node
        for (int i = 1; i < position; i++) {
            currentNode = currentNode.next; //its like increment one node
        }
        Node newNode = new Node(ele);
        newNode.next = currentNode.next;
        currentNode.next = newNode;
        size++;
    }

    public Object removeFirst() {
        //to check whether list is empty or not
        if (head == null) {
            throw new IllegalStateException("the list is empty");
        }
        Node element = head;
        Object ele = element.data;
        head = head.next;
        if (size() == 1) {
            last = null;
        }
        size--;
        return ele;
    }

    public Object peek(){
        final Node f = head;
        return (f == null) ? null : f.data;
    }

    public Object removeLast() {
        //to check whether list is empty or not
        if (last == null) {
            throw new IllegalStateException("the list is empty");
        }
        Object ele = last.data;
        // if there is only one element in list
        if (size() == 1) {
            head = null;
            last = null;
        }

        // Find the second last node
        Node second_last = head;
        while (second_last.next.next != null) {
            second_last = second_last.next;
        }

        // Change next of second last
        second_last.next = null;
        size--;
        return ele;

    }

    public Object removeAt(int position) {
        //to check whether list is empty or not
        if (last == null) {
            throw new IllegalStateException("the list is empty");
        }

        if(position == 1){
            return removeFirst();
        }

        Node currentNode = head;
        Node prevNode = head;
        //start at 1 because we already on first node
        for (int i = 1; i < position; i++) {
            prevNode = currentNode;
            currentNode = currentNode.next;
        }
        Object element = currentNode.data;
        prevNode.next = currentNode.next;
        size--;
        return element;
    }

    public Object get(int position){
        //to check whether list is empty or not
        if (last == null) {
            throw new IllegalStateException("the list is empty");
        }
        Node currentNode = head;
        for (int i = 0; i < size ; i++) {
            if(i == position){
                return currentNode.data;
            }
            currentNode = currentNode.next;
        }
        return null;
    }

    public int find(Object ele){
        //to check whether list is empty or not
        if (last == null) {
            throw new IllegalStateException("the list is empty");
        }
        Node currentNode = head;
        for (int i = 0; i < size ; i++) {
            if(currentNode.data.equals(ele)){
                return i;
            }
            currentNode = currentNode.next;
        }
        return -1;
    }

    /**
     * Returns the first element in this list.
     *
     * @return the first element in this list
     * @throws NoSuchElementException if this list is empty
     */
    public Object getFirst() {
        final Node f = head;
        if (f == null)
            throw new NoSuchElementException();
        return f.data;
    }

    /**
     * Returns the last element in this list.
     *
     * @return the last element in this list
     * @throws NoSuchElementException if this list is empty
     */
    public Object getLast() {
        final Node l = last;
        if (l == null)
            throw new NoSuchElementException();
        return l.data;
    }

    public void printList() {
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
