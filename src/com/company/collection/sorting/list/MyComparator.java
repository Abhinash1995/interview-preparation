package com.company.collection.sorting.list;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {
    //if we want our own customized sorting then we have to go for comparator interface


    @Override
    public int compare(Integer o1, Integer o2) {
        //when we are adding element to arraylist it will call compare method and
// if o1>o2 return 1 or return -1 if we dont want to add return 0
        if(o1 > o2){
            return -1;
        }else if(o1 < o2){
            return 1;
        }else {
            return 0;
        }
    }
}
