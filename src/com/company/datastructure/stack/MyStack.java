package com.company.datastructure.stack;

import java.util.EmptyStackException;

public class MyStack {
    private int capacity;
    private Object stack[];
    int top = -1;//top=null;
//when stack is empty it will point to -1
    MyStack(int capacity){
        stack = new Object[capacity];
    }

    public void push(Object item){
        //as we are starting top from -1
        if(top == stack.length -1){
//            System.out.println("Stack Overflow...");
            //need to resize the baking array
            Object[] newStack = new Object[2 * stack.length];
            System.arraycopy(stack,0,newStack,0,stack.length);
            stack = newStack;
        }
        stack[++top] = item;//stack[top++]
    }

    public Object pop(){
        if(isEmpty()){
            System.out.println("Stack UnderFlow...");
            return new EmptyStackException();
        }
        return stack[top--];//stack[--top] if we start top from 0
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public Object peek(){
        if(isEmpty()){
            System.out.println("Stack UnderFlow...");
            return new EmptyStackException();
        }
        return stack[top];
    }

    public int size(){
        return top+1;
    }

    public int search(Object item){
        for (int i = 0; i <=top ; i++) {
            if(item == stack[i]){
                return top - i + 1;
            }
        }
        return -1;
    }

    public String toString(){
        String str = "[";
        for (int i = 0; i <= top ; i++) {
            str = str + stack[i];
            if(i < top)
                str = str + ", ";
        }
        return str + "]";
    }

}
