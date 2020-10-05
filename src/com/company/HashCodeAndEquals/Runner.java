package com.company.HashCodeAndEquals;

import java.util.HashMap;
import java.util.Map;

public class Runner {


    public static void main(String[] args) {
        Employee employee = new Employee(1);
        Employee emp2 = new Employee(1);

        Map<Employee, String> map = new HashMap<>();
        map.put(emp2, "Ram");
        map.put(employee, "Ram");
        System.out.println(map.size());


        Map<Integer, String> map1 = new HashMap<>();
        Integer integer = new Integer(1);
        Integer i2 = new Integer(1);
        System.out.println(integer);
        System.out.println(i2);
        map1.put(integer, "Rajesh");
        map1.put(i2, "Rajesh");
        System.out.println(map1.size());
    }
}
