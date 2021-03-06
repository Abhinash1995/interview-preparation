package com.company.recursion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

//find n th number in fibonacci series
public class Fibonacci {

    public static int fib(int num){
        if(num < 0){
            throw new IllegalArgumentException("Fibonacci of negative number is not possible");
        }
        else if(num == 1 || num == 2){
            return num - 1;
        }
        return fib(num-1)  +fib(num -2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = sc.nextInt();
        System.out.println(fib(number));
    }


//        return hospitalsList.stream()
//                .filter(hospital -> Objects.nonNull(hospital.getPeriod()))
//            .filter(hospital -> hospital.getPeriod().equalsIgnoreCase("2014"))
//            .sorted(Comparator.comparing(Hospitals::getRegion).reversed())
//            .collect(Collectors.toCollection(ArrayList::new)); 

}
