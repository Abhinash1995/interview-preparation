package com.company;


import java.util.Scanner;

//https://www.hackerrank.com/challenges/array-left-rotation/problem
public class LeftRotation {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        int n = scanner.nextInt();//5

        int d = scanner.nextInt();//4
        int[] arr = new int[n];
        for(int i = 0; i<n;i++){
            arr[i] = scanner.nextInt();
        }
//1 2 3 4 5 -> 2 3 4 5 1
//op ->5 1 2 3 4
//        while(d>0){
            for (int i = 1; i < n; i++) {
                int temp;
                if(i == n-1){
                    arr[n-1]=arr[i];
                }else{
                    arr[i+1-1] = arr[i];
                }
            }
//            d--;
//        }
        for(int i = 0; i<n;i++){
            System.out.print(arr[i]+ " ");
        }

        scanner.close();
    }

}
