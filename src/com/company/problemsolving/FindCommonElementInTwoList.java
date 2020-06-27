package com.company.problemsolving;

import java.util.ArrayList;
import java.util.List;

public class FindCommonElementInTwoList {

    //Method 1
    //Native Approach
    //First create two ArrayList and add values of list.
    //Create a temporary ArrayList to contain common elements.
    //Iterate through the list1 and check if that element is present in the list2 using ArrayList.contains() method.
    //If found, add it to the list3
    //Print the common elements from list3
    public static <T> List<T> findCommonElementByNativeApproach(List<T> list1, List<T> list2) {

        ArrayList<T> newList = new ArrayList<T>();
        // Traverse through the first list
        for (T temp : list1) {

            // Check if theis element is
            // present in list2 or not
            if (list2.contains(temp)) {
                // Since present, add it to list3
                newList.add(temp);
            }
        }
        // return the new list
        return newList;
    }
//----------------------------------------------
    //2. Collections1.retainAll(Collections2)
    //
    //This method keeps only the common elements
    //of both Collection in Collection1.

//-----------------------------------
    //3. Stream filter
    //First create two ArrayList and add values of list.
    //Convert the ArrayList to Stream using stream() method.
    //Set the filter condition to be distinct using contains() method.
    //Collect the filtered values as List using collect() method. This list will be return common element in both list.
    //Print list3

    //list1.stream()
    //    .filter(list2::contains)
    //    .collect(Collectors
    //    .toList()));

}
