package com.company.problemsolving;

import java.util.Scanner;
//Given a list of numbers and a number k,
//return whether any two numbers from the list add up to k.

//For example, given [10, 15, 3, 7] and k of 17,
//return true since 10 + 7 is 17.
public class Task1 {

    public boolean isTrue(int[] arr, int k){
        int sum = 0;
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 1; j < arr.length; j++) {
                sum = arr[i] + arr[j];
                if(sum == k){
                    return  true;
                }
            }
        }
        return  false;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter no of element in array");
        int no = sc.nextInt();
        int[] arr = new int[no];
        System.out.println("enter" + no + "value ");
        for (int i = 0; i < no; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the value of k");
        int k = sc.nextInt();

        Task1 t = new Task1();

        System.out.println(t.isTrue(arr,k));




    }
}
