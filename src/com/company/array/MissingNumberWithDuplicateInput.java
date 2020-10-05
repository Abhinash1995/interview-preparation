package com.company.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MissingNumberWithDuplicateInput {

    public static int sumOfAllNNumbers(int n){
        int sum = (n*(n+1))/2;
        return sum;
    }

    public static int sumOfHashSetNumbers(HashSet<Integer> hsobj){
        int sum = 0;
        for(Integer obj : hsobj){
            sum = sum + obj;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Given input Array from 1 to n
        Integer[] input = {10,9,6,7,7,9,10,3,4,3,5,1,2};
        //Convert input Array to List
        List arrList = Arrays.asList(input);

        //Remove Duplicates by passing list
        //to the HashSet Constructor
        HashSet<Integer> hsobj = new HashSet(arrList);

        // Calculate n value
        int n = hsobj.size() + 1;

        // Calculate Sum of N Number
        // using Math formula n(n+1)/2
        int sumOfNNumbers = sumOfAllNNumbers(n);

        // Calculate Sum of all numbers in HashSet object
        int sumOfHashSetNumbers = sumOfHashSetNumbers(hsobj);

        // Calculate missing number
        // using subtraction
        int missingNumber = sumOfNNumbers - sumOfHashSetNumbers;

        // Print the Missing number
        System.out.println("Missing number in an array is : "
                + missingNumber);
    }
}
