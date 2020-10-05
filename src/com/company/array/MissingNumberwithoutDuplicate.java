package com.company.array;

import java.util.Scanner;

//int[] input = {10,9,6,7,4,3,5,1,2}
//Output :
//Missing number in an array : 8
//here no duplicate number in an array
public class MissingNumberwithoutDuplicate {

    public static int sumOfAllNNumbers(int n){
        return  (n*(n+1))/2;
    }

    public static int sumOfInputArrayNumbers(int[] input){
        int sum = 0;
        for(int i=0; i < input.length ;i++){
            sum = sum + input[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the value");
        int[] number = new int[9];
        for (int i = 0; i < number.length; i++){
            number[i] = sc.nextInt();
        }

        // Calculate n value
        int n = number.length + 1;

        // Calculate Sum of N Number
        // using Math formula n(n+1)/2
        int sumOfNNumbers = sumOfAllNNumbers(n);

        // Calculate Sum of all numbers in input array
        int sumOfInputArray = sumOfInputArrayNumbers(number);

        // Calculate missing number
        // using subtraction
        int missingNumber = sumOfNNumbers - sumOfInputArray;

        System.out.println("Missing number in an array is : "
                + missingNumber);

    }

}

