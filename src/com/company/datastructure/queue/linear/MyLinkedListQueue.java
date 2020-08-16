package com.company.datastructure.queue.linear;

import com.company.datastructure.linkedlist.single.GenericLinkedList;

//Implementing Queue using already implemented linked list we can also do it from scratch
public class MyLinkedListQueue<X> {

    GenericLinkedList<X> linkedList;

    public MyLinkedListQueue(){
        linkedList = new GenericLinkedList<>();
    }

    public void enQueue(X data){
        linkedList.addLast(data);
    }

    public X deQueue(){
        return linkedList.removeFirst();
    }

    public boolean isEmpty(){
        return linkedList.isEmpty();
    }

    public void printQueue(){
        linkedList.printList();
    }

    public X peek(){
        return linkedList.getFirst();
    }

    public int size(){
        return linkedList.size();
    }
}
