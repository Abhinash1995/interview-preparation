package com.company.linkedlist;

public class MainCircular {

    public static void main(String[] args) {
        MyCircularSingleLinkList linkList = new MyCircularSingleLinkList();
        linkList.addFirst("Ram");
        linkList.addFirst("Shyam");
        linkList.addFirst("Rohan");
        linkList.addLast("Papaya");
        linkList.addFirst("Apple");
        linkList.printList();
    }
}
