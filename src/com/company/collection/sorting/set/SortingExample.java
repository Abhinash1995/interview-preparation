package com.company.collection.sorting.set;

import com.company.collection.sorting.list.MyComparator;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SortingExample {

    public static Set<Integer> defaultSorting(){
        Set<Integer> set = new TreeSet<>();
        set.add(20);
        set.add(50);
        set.add(10);
        set.add(30);
        set.add(40);
        return set;
    }

    public static Set<Integer> customizedSorting(){
        Set<Integer> set = new TreeSet<>(new MyComparator());
        set.add(20);
        set.add(50);
        set.add(10);
        set.add(30);
        set.add(40);
        return set;
    }

    public static Set<Integer> customizedSortingWithLambda(){
//        Set<Integer> set = new TreeSet<>(((o1, o2) -> (o1 > o2)? -1 : (o1<o2)? 1 : 0));
        Set<Integer> set = new TreeSet<>(((o1, o2) -> o2.compareTo(o1)));
        set.add(20);
        set.add(50);
        set.add(10);
        set.add(30);
        set.add(40);
        return set;
    }

    public static Set<Integer> customizedSortingWithComparatorReverse(){
        Set<Integer> set = new TreeSet<>((Comparator.reverseOrder()));
        set.add(20);
        set.add(50);
        set.add(10);
        set.add(30);
        set.add(40);
        return set;
    }

    public static void main(String[] args) {
        System.out.println("Default Sorting" + defaultSorting());
        System.out.println("Customized Sorting" + customizedSorting());
        System.out.println("Customized Sorting with lambda" + customizedSortingWithLambda());

        System.out.println("Customized Sorting with Comarataor reverse method" + customizedSortingWithComparatorReverse());
    }
}
