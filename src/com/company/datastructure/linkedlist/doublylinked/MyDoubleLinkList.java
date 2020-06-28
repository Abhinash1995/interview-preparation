package com.company.datastructure.linkedlist.doublylinked;

public class MyDoubleLinkList<X> {

    private Node first;
    private Node last;
    private int size;

    private class Node{
        X data;
        Node next;
        Node prev;

        Node(X data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }

        public X getData() {
            return data;
        }

        public void setData(X data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }
    }

    public int size() {
        return size;
    }

    public void addFirst(X data) {
        Node newNode = new Node(data);
        if(first == null){
            //this condition means we are adding element for the first time as list is empty
            first = newNode;
            last = newNode;
        }else {
            first.setPrev(newNode);
            newNode.setNext(first);
            first = newNode;
        }
        size ++;
    }

    public void addLast(X data) {
        Node newNode = new Node(data);
        if(first == null){
            //this condition means we are adding element for the first time as list is empty
            first = newNode;
        }else {
            last.setNext(newNode);
            newNode.setPrev(last);
        }
        last = newNode;
        size ++;
    }

    public boolean add(X data){
        //adding in DoublyLinkList means adding at last
        addLast(data);
        return true;
    }

    public void insertAt(X ele, int index) {
        if (size() < index) {
            throw new IndexOutOfBoundsException("the link list is smaller than the position you are trying ta add item");
        }
        //if index is 0  add at first position
        if (index == 0) {
            addFirst(ele);
        }
        //if index equals size i.e add at last position
        if(index == size){
            addLast(ele);
        }

        Node currentNode = first;
        //start at 1 because we already on first node
        for (int i = 1; i < index; i++) {
            currentNode = currentNode.getNext(); //its like increment one node
        }
        Node temp = currentNode;
        Node newNode = new Node(ele);
        newNode.setPrev(currentNode.getPrev());
        newNode.setNext(currentNode);
        currentNode.getPrev().setNext(newNode);
        currentNode.setPrev(newNode);
        size++;
    }

    public X removeFirst(){
        //to check whether list is empty or not
        if(size == 0){
            throw new IllegalStateException("The List is Empty");
        }
        X element = first.getData();
        first = first.getNext();
        if(first != null)
            first.setPrev(null);
        size--;
        return element;
    }

    public X removeLast(){
        X element = last.getData();
        //to check whether list is empty or not
        if(size == 0){
            throw new IllegalStateException("The List is Empty");
        }
        //if there is only one element
        if (size() == 1) {
            first = null;
            last = null;
        }

        //alternative get second last be traversing each node
        // Find the second last node
//        Node second_last = first;
//        while (second_last.getNext() != null) {
//            second_last = second_last.next;
//        }
//        second_last.getPrev().setNext(null);

        //we can get second last from last node so no need of traversing each node
        last.getPrev().setNext(null);
        last = last.getPrev();
        size --;

        return element;
    }

    public X removeAt(int position){
        //to check whether list is empty or not
        if (size == 0) {
            throw new IllegalStateException("the list is empty");
        }

        if(position == 1){
            return removeFirst();
        }
        Node currentNode = first;
        Node prevNode = first;
        for (int i = 1; i < position; i++) {
            prevNode = currentNode;
            currentNode = currentNode.getNext();
        }
        X ele = currentNode.getData();
        prevNode.setNext(currentNode.getNext());
        currentNode.getNext().setPrev(prevNode);
        size--;
        return ele;
    }

    public Object get(int position){
        //to check whether list is empty or not
        if (last == null) {
            throw new IllegalStateException("the list is empty");
        }
        Node currentNode = first;
        for (int i = 0; i < size ; i++) {
            if(i == position){
                return currentNode.data;
            }
            currentNode = currentNode.next;
        }
        return null;
    }

    public int find(X ele){
        //to check whether list is empty or not
        if (last == null) {
            throw new IllegalStateException("the list is empty");
        }
        Node currentNode = first;
        for (int i = 0; i < size ; i++) {
            if(currentNode.data.equals(ele)){
                return i;
            }
            currentNode = currentNode.next;
        }
        return -1;
    }

    public void printList(){
        Node currentNode = first;
        while (currentNode != null){
            System.out.print(currentNode.getData());
            if(currentNode.getNext() !=null)
                System.out.print(" <=> ");
            currentNode = currentNode.getNext();
        }
    }

    public void printListUsingFor(){
        Node currentNode = first;
        for (int i = 0; i < size ; i++) {
            System.out.print(currentNode.getData());
            if(currentNode.getNext() !=null)
                System.out.print(" <=> ");
            currentNode = currentNode.getNext();
        }
    }

    public void printInRev(){
        Node currentNode = last;
        for (int i = size; i > 0 ; i--) {
            System.out.print(currentNode.getData());
            if(currentNode.getPrev() !=null)
                System.out.print(" <=> ");
            currentNode = currentNode.getPrev();
        }
    }
}
