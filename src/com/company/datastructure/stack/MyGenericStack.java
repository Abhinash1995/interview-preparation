package com.company.datastructure.stack;

public class MyGenericStack<X> {

    private X[] data;
    private int capacity;
    private int top;

    MyGenericStack(int capacity){
        data = (X[]) new Object[capacity];
    }

}
