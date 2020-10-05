package com.company.array;

import java.util.HashSet;

public class FindDuplicateElementInAnArray {
    public static void main(String args[]) {

        String[]  arr1 = {"abc", "java", "javahungry", "java", "javahungry" };

        //finding duplicate using loop
        for(int i=0; i < arr1.length-1; i++){
            for(int j=i+1; j < arr1.length; j++) {

                if(arr1[i].equals(arr1[j]) && i!=j ) {
                    System.out.println("Duplicate in Array is using loop : "+ arr1[j]);

                }
            }
        }

        //finding duplicate using hashset
        HashSet<String> set = new HashSet<String>();

        for (String val : arr1)
        {
            if (!set.add(val)){
                System.out.print (val+" ");
            }
        }
    }
}
