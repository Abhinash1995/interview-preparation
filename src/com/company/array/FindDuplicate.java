package com.company.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindDuplicate {

    //finding duplicate usinh hasset
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicateVal = new ArrayList<>();
        HashSet<Integer> set = new HashSet<Integer>();
        for (int val : nums)
        {
            if (!set.add(val)){
                duplicateVal.add(val);
            }
        }
        return duplicateVal;

    }

    //finding duplicate using loop
    public static List<Integer> findDuplicatesusingLoop(int[] nums) {
        List<Integer> duplicateVal = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j])
                    System.out.print(nums[j]);
            }
        }
        return duplicateVal;

    }

    public static void main(String[] args) {
        int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};

        System.out.println("Duplicate elements in given array using set: ");
        List<Integer> duplicatesVal;
        duplicatesVal = findDuplicates(arr);
        for (Integer val : duplicatesVal){
            System.out.print(val +"  ");
        }
        System.out.println();

        System.out.println("Duplicate elements in given array using loop: ");
        duplicatesVal = findDuplicatesusingLoop(arr);
        for (Integer val : duplicatesVal){
            System.out.print(val +"  ");
        }
    }
}
