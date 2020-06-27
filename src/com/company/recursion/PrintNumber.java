package com.company.recursion;

import java.util.Scanner;

//Print number 1 to n without loop
public class PrintNumber {

    public static void printNumberInAsc(int n){
        if(n > 1)
            printNumberInAsc(n-1);
        System.out.println(n);
    }

    public static void printNumberInDcs(int n){
        System.out.println(n);
        if(n > 1)
            printNumberInDcs(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = sc.nextInt();
        System.out.println("Printing Number in Ascending");
        PrintNumber.printNumberInAsc(number);
        System.out.println("Printing Number in Descending");
        PrintNumber.printNumberInDcs(number);



    }
}
