package com.company.datastructure.linkedlist.single;

import com.company.datastructure.Student;

public class MainSingle {
    public static void main(String[] args) {
        MySingleLinkedList singleLinkedList = new MySingleLinkedList();
//        singleLinkedList.add(1);
//        singleLinkedList.linkFirst(2);
//        singleLinkedList.add(3);
//        singleLinkedList.add(4);


        Student student = new Student(1,"Abhinash");
        singleLinkedList.add("Abc");
        singleLinkedList.add("sbc");
        singleLinkedList.add("Ram");
        singleLinkedList.insertAt("Raja",2);

        singleLinkedList.add(student);
        singleLinkedList.printList();
        Object ele = singleLinkedList.removeFirst();
        System.out.println(ele);
        singleLinkedList.printList();
        Object lastRemoved = singleLinkedList.removeLast();
        System.out.println(lastRemoved);
        singleLinkedList.printList();


    }
}
