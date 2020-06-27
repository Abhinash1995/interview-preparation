package com.company.linkedlist;

public class MainDoublyLinkList {
    public static void main(String[] args) {
        MyDoubleLinkList<String> linkList = new MyDoubleLinkList<>();
        linkList.addFirst("Ram");
        linkList.addFirst("Shyam");
        linkList.addLast("Abhi");
        linkList.addLast("Raja");
        linkList.addFirst("Ramu");
        linkList.add("Mango");
//        linkList.insertAt("Zoo",2);
        linkList.printList();
        System.out.println();
        linkList.printInRev();
        System.out.println();
        System.out.println(linkList.removeFirst());
        linkList.printList();
        System.out.println();
        System.out.println(linkList.removeLast());
        System.out.println();
        linkList.printList();
        System.out.println();
        System.out.println(linkList.removeAt(3));
        System.out.println(linkList.size());
        linkList.printList();
        System.out.println();
        linkList.printListUsingFor();
        System.out.println();
        linkList.printInRev();
        System.out.println();
        System.out.println(linkList.get(1));
        System.out.println(linkList.find("Ram"));
    }
}
