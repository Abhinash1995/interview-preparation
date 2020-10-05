package com.company.collection.sorting.map;

import java.util.TreeMap;

public class TreemapExample {
    //if we want to have sorting facility in case of Map then we should go for TreeMap
    //TreeMap is ment for sorting key value pair will be inserted according tto sorting order of keys
    //treeMap only except comparator object as argument
    //i.e the class that implements comparator Interface
    //we have to pass comparator object as argument in constructor of TreeMap
    // to have our own sorting order



    public static TreeMap<Integer, String> defaultSorting(){
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(10,"Ram");
        map.put(30,"Abhi");
        map.put(50,"Pratap");
        map.put(40,"Sudip");
        map.put(20,"Rajesh");

        return map;
    }

    public static TreeMap<Integer, String> customizedSorting(){
        TreeMap<Integer, String> map = new TreeMap<>((o1,o2)-> (o1>o2)? -1: (o1<o2)? 1: 0);
        map.put(10,"Ram");
        map.put(30,"Abhi");
        map.put(50,"Pratap");
        map.put(40,"Sudip");
        map.put(20,"Rajesh");

        return map;
    }


    public static void main(String[] args) {

        System.out.println("Default sorting "+ defaultSorting());
        System.out.println("Customized sorting "+ customizedSorting());

    }
}
