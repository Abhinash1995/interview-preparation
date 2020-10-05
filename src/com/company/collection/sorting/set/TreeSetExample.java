package com.company.collection.sorting.set;

import com.company.collection.sorting.list.MyComparator;

import java.util.*;

public class TreeSetExample {
    //if we want sorting order incase of set go fot TreeSet
    //treeset only except comparator object as argument
    //i.e the class that implements comparator Interface
    //we have to pass comparator object as argument to have our own sorting order

    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>(new MyComparator());
        set.add(20);
        set.add(50);
        set.add(10);
        set.add(30);
        set.add(40);
        System.out.println(set);
    }
}
