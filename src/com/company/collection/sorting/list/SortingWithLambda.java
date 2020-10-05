package com.company.collection.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingWithLambda {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(60);
        list.add(50);
        list.add(40);

        System.out.println("Before Sorting" + list);

        Collections.sort(list);
        System.out.println("Default Sorting order" + list);


//        Collections.sort(list, new MyComparator());

        //where ever we are using functional interface we can replace that with lambda expression
//        Collections.sort(list, ((o1, o2) -> (o1 > o2)? -1 : (o1<o2)? 1 : 0));
        Collections.sort(list, ((o1, o2) -> o2.compareTo(o1)));

        //lambda expression is applicable incase of all functional interface
        System.out.println("after customized sorting" + list);

    }
}
