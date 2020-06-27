package com.company.problemsolving;


import java.util.*;

//        Input:[1, 10, 2, 2, 10, 3, 3, 3, 4, 5, 5]
//        Output: [1, 10, 2, 3, 4, 5]
//        Input: ["G", "e", "e", "k", "s"]
//        Output: ["G", "e", "k", "s"]
public class RemoveDuplicatesFromList {

    //   Method I Using Iterator
    //    ----------------------------------------------------
    // 1.   Get the ArrayList with duplicate values.
    // 2.   Create another ArrayList.
    // 3.   Traverse through the first arraylist and store the first appearance of each element into the second arraylist using contains() method.
    // 4.   The second ArrayList contains the elements with duplicates removed.

    // Function to remove duplicates from an ArrayList
    public static <T> List<T> removeDuplicates(List<T> list) {

        ArrayList<T> newList = new ArrayList<T>();

        // Traverse through the first list
        for (T element : list) {

            // If this element is not present in newList
            // then add it
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }

        // return the new list
        return newList;
    }

    //   Method I Using LinkedHashSet
    //    ----------------------------------------------------
    //Get the ArrayList with duplicate values.
    //Create a LinkedHashSet from this ArrayList. This will remove the duplicates
    //Convert this LinkedHashSet back to Arraylist.
    //The second ArrayList contains the elements with duplicates removed.
    //Below is the implementation of the above approach:
    // Function to remove duplicates from an ArrayList
    public static <T> List<T> removeDuplicatesUsingHashSet(List<T> list)
    {
        // Create a new LinkedHashSet

        // Add the elements to set
        Set<T> set = new LinkedHashSet<>(list);

        // Clear the list
        list.clear();

        // add the elements of set
        // with no duplicates to the list
        list.addAll(set);

        // return the list
        return list;
    }

    //   Method III Using    Stream.distinct()
    //    ----------------------------------------------------
    //Get the ArrayList with duplicate values.
    //Create a new List from this ArrayList.
    //Using Stream().distinct() method which return distinct object stream.
    //convert this object stream into List
    //use   List<Integer> newList = list.stream().distinct().collect(Collectors.toList());

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter How many number you have");
        int index = sc.nextInt();
        Integer[] arr = new Integer[index];
        System.out.println("Enter the values");
        //getting data from user in array
        for (int i = 0; i < index; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> list = Arrays.asList(arr);
        for (Integer val : list) {
            System.out.println(val);
        }
        List<Integer> newList = removeDuplicates(list);
        System.out.println("-----------------------");
        for (Integer val : newList) {
            System.out.println(val);
        }

    }


}
