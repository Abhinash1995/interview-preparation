package com.company.recursion;

import java.util.LinkedList;
import java.util.Scanner;

public class Factorial {

    public static int factorial(int number){
        if(number == 0){
            return 1;
        }
        return (number * factorial(number-1) );
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = sc.nextInt();
        System.out.println(factorial(number));
        LinkedList<String> linkedList = new LinkedList<>();
    }
}
