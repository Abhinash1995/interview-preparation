package com.company.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindPairWithGivenSumInTheArray {
//Problem statement
//    Input  :  arr[] = {1, 5, 7, -1, 5},
//    sum = 6
//    Output : (1, 5) (7, -1) (1, 5)

    //complexity in o(n2)
    public static void printPair(int[] arr, int sum){

        for (int index = 0; index < arr.length; index++) {
            for (int j = index + 1; j <arr.length ; j++) {
                if(arr[index] +  arr[j] == sum){
                    //we can also print the index
                    System.out.println("( Pair found  at index" + index+ " and " + j + ")");
//                    return; if i include return then it will find first pair only then i can use pair not fount statement
                }
            }
        }
//        System.out.println("Pair not found");
    }

    // O(nlog(n)) solution using sorting
    public static void pairedElements(int arr[], int sum)
    {
        Arrays.sort(arr);
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            if (arr[low] + arr[high] == sum) {
                //we can print pair index as well
                System.out.println("The pair is : (" + arr[low] + ", " + arr[high] + ")");
//                return;
            }
            if (arr[low] + arr[high] > sum) {
                high--;
            }
            else {
                low++;
            }
        }
//        System.out.println("Pair not found");
    }

    // O(n) solution using hashing
    public static void findPair(int[] A, int sum)
    {
        // create an empty Hash Map
        Map<Integer, Integer> map = new HashMap<>();

        // do for each element
        for (int i = 0; i < A.length; i++)
        {
            // check if pair (arr[i], sum-arr[i]) exists

            // if difference is seen before, print the pair
            if (map.containsKey(sum - A[i]))
            {
                System.out.println("Pair found at index " +
                        map.get(sum - A[i]) + " and " + i);
//                return;
            }

            // store index of current element in the map
            map.put(A[i], i);
        }

        // No pair with given sum exists in the array
//        System.out.println("Pair not found");
    }


    public static void main(String[] args) {
        System.out.println("Enter how many element  you have in array");
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter "+ size + " element in your array");
        for (int index = 0; index < arr.length; index++) {
            arr[index] = sc.nextInt();
        }
        System.out.println("Enter the sum value");
        int sum = sc.nextInt();
        System.out.println("Traditional approach");
        printPair(arr, sum);
        System.out.println("Hashing approach");
        findPair(arr, sum);
        System.out.println("Sorting approach");
        pairedElements(arr,sum);
    }
}
