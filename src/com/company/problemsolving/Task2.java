package com.company.problemsolving;


//Given an array of integers, return a new array
//such that each element at index i of the new array is the
//product of all the numbers in the original array except the one at i.

//For example, if our input was [1, 2, 3, 4, 5],
//the expected output would be [120, 60, 40, 30, 24].
//If our input was [3, 2, 1], the expected output would be [2, 3, 6].
public class Task2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] brr = new int[arr.length];


        for (int i = 0; i <arr.length ; i++) {
            int prod = 1;
            for (int j = 0; j <arr.length ; j++) {
                if(i !=j) {
                    prod = prod * arr[j];
                }
            }
            brr[i] = prod;

        }

        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("output");
        for (int i = 0; i <brr.length ; i++) {
            System.out.println(brr[i]);

        }
    }
}
