package com.company.collection.sorting.list;

import com.company.collection.sorting.list.MyComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//sorting for array list
public class DefaultAndCustomizedSorting {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(60);
        list.add(50);
        list.add(40);



        //list preserve insertion order
        System.out.println("Before Sorting");
        list.forEach(System.out::println);

        //default natural sorting for array is assending and for string it is alphabetical
        System.out.println("Default Sorting order");
        Collections.sort(list);
//when we are adding element to arraylist it will call compare method and
// if o1>o2 return 1 or return -1 if we dont want to add return 0
        list.forEach(System.out::println);

        //if we want our own customized sorting then we have to go for comparator interface
        Collections.sort(list, new MyComparator());
        System.out.println("after customized sorting");
        list.forEach(System.out::println);

    }
}
//if we want to sort list we have to use Collection.sort
//in set if we want sorting facility then we have to go for treeset it preserve natural sorting order
