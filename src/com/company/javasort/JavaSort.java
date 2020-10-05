package com.company.javasort;

import com.company.HashCodeAndEquals.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class JavaSort {

    public static void main(String[] args)
    {
        ArrayList<Student> employees = getUnsortedEmployeeList();

        //Compare by first name and then last name
        Comparator<Student> compareByName = Comparator
                .comparing(Student::getfName)
                .thenComparing(Student::getsName);

        Collections.sort(employees, compareByName);

        System.out.println(employees);
    }

    private static ArrayList<Student> getUnsortedEmployeeList()
    {
        ArrayList<Student> list = new ArrayList<>();
        list.add( new Student(2, "Lokesh", "Gupta") );
        list.add( new Student(1, "Alex", "Gussin") );
        list.add( new Student(4, "Brian", "Sux") );
        list.add( new Student(5, "Neon", "Piper") );
        list.add( new Student(3, "David", "Beckham") );
        list.add( new Student(7, "Alex", "Beckham") );
        list.add( new Student(6, "Brian", "Suxena") );
        return list;
    }

}
