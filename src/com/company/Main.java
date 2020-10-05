package com.company;

import com.company.HashCodeAndEquals.Employee;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int x =5;
        int y = 5;
        Employee employee = new Employee(5);
        Employee employee1 = new Employee(5);

        System.out.println(x==y);
        System.out.println(employee.equals(employee1));
        System.out.println(employee instanceof  Employee);
    }
}
