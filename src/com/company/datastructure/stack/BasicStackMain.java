package com.company.datastructure.stack;

public class BasicStackMain {
    public static void main(String[] args) {
        MyStack stack = new MyStack(2);
        stack.push("Ram");
        stack.push("Abhi");
        stack.push("Raja");
        stack.push("Rohan");
        System.out.println(stack.search("Raja"));
        System.out.println(stack.toString());
        System.out.println(stack.top);
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.toString());
        System.out.println(stack.top);
        System.out.println(stack.peek());
        System.out.println(stack.toString());
        System.out.println(stack.top);
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.toString());
        System.out.println(stack.top);
        stack.pop();



    }
}
