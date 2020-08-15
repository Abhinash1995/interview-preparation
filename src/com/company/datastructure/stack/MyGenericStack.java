package com.company.datastructure.stack;

public class MyGenericStack<X> {

    private X[] data;
    private int capacity;
    private int stackPointer;

    MyGenericStack(int capacity){
        data = (X[]) new Object[capacity];
        stackPointer = 0;
    }

    public void push(X newItem){
        data[stackPointer ++] = newItem;
    }

    public X pop(){
        if(stackPointer == 0){
            throw new  IllegalStateException("No more item in stack");
        }
        return data[--stackPointer];
    }

    public boolean contains(X item){
        boolean found = false;
        for (int i = 0; i<stackPointer; i++){
            if(data[i].equals(item)){
                found = true;
                break;
            }
        }
        return found;
    }

    public X access(X item){
        while (stackPointer > 0){
            X tempItem = pop();
            if(item.equals(tempItem)){
                return tempItem;
            }
        }
        throw new IllegalArgumentException("could not found item on stack " + item);
    }

}
