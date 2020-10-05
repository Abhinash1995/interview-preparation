package com.company.array;

//       This problrm can be solved in a lot of ways if we are allowed to use extra space.
//        But we are trying to solve this problem without using any extra space.
//        To solve this problem we will iterate through the input array and mark
//        elements as negative using nums[nums[i] -1] = -nums[nums[i]-1].
//        e.g. We have an array [4, 3, 2, 7, 8, 2, 3, 1]
//        We will start iterating this array. Below will be the array elements after processing each element:
//        when i = 0 , than nums[i] is 4 , so array will become [4, 3, 2, -7, 8, 2, 3, 1]
//        when i = 1 , than nums[i] is 3 , so array will become [4, 3, -2, -7, 8, 2, 3, 1]
//        when i = 2 , than nums[i] is 2 , so array will become [4, -3, -2, -7, 8, 2, 3, 1]
//        when i = 3 , than nums[i] is 7 , so array will become [4, -3, -2, -7, 8, 2, -3, 1]
//        when i = 4 , than nums[i] is 8 , so array will become [4, -3, -2, -7, 8, 2, -3,-1]
//        when i = 5 , than nums[i] is 2 , so array will become [4, -3, -2, -7, 8, 2, -3,-1]
//        when i = 6 , than nums[i] is 3 , so array will become [4, -3, -2, -7, 8, 2, -3,-1]
//        when i = 7 , than nums[i] is 1 , so array will become [-4, -3, -2, -7, 8, 2, -3,-1]
//        In this way all the numbers that we have seen will be marked as negative. In the second
//               iteration,if a value is not marked as negative, it means we have never seen that index before,
//               so just add it to the return list.

import java.util.ArrayList;
import java.util.List;

public class FindMissingElementInAnArray {

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]) - 1;
            if (nums[val] > 0) {
                nums[val] = -nums[val];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] input = {4,3,2,7,8,2,3,1};
        List<Integer> missingNumber = findDisappearedNumbers(input);
        for (Integer val : missingNumber){
            System.out.println(val);
        }
    }

}
