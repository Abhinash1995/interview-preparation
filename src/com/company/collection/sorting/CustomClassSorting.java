package com.company.collection.sorting;

import com.company.HashCodeAndEquals.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomClassSorting {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student(100, "Abhinash"));
        list.add(new Student(400, "Ram"));
        list.add(new Student(300, "Pratap"));
        list.add(new Student(200, "Sudip"));

//        > means after

        //sort method only takes comparable object
        System.out.println("In Assending Order");
        Collections.sort(list, (s1, s2)-> (s1.getRollNo() > s1.getRollNo())? 1 : (s1.getRollNo() < s2.getRollNo())? -1 : 0);
        System.out.println(list);

        System.out.println("Descending Order");
        Collections.sort(list, (s1, s2)-> (s1.getRollNo() < s1.getRollNo())? 1 : (s1.getRollNo() > s2.getRollNo())? -1 : 0);
        System.out.println(list);

        //main advantage of lambda expression is we can replace some class just by lambda expression
        //a small expression replaces the class
        //for all runnable interface implementation we can replace with lambda expression
        //i.e when ever we are implementing any runnable interface that implementation class can
        // be replace with lambda expression example is Comparator Interface
    }
}
