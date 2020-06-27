package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//https://www.techgig.com/challenge/question/coding-round/QzNDbDNMQ2p2ODRxY21MbUNNT2RuNUNrczk5RnN6a0VyWFozMjdnWEppQXlPd0RRbXBRS3hMMDNVZGg5aXhpdw==/1
public class ProxyAttendence {
//7
//1 2 3 3 4 6 4

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int noOfStudent = sc.nextInt();
        int[] arr = new int[noOfStudent];
        for (int i = 0; i < noOfStudent; i++) {
            arr[i] = sc.nextInt();
        }

        List<Integer> absenties = new ArrayList<>();
        for (int student = 1; student <= noOfStudent; student++) {

            //check if student is present
            boolean isPresent = false;
            for (int j = 0; j < arr.length; j++) {
                if (student == arr[j]) {
                    isPresent = true;
                    break;
                }
            }
            if (!isPresent) {
                absenties.add(student);
            }
        }

        boolean isFirst = true;
        for (int absenti : absenties) {
            if (isFirst) {
                isFirst = false;
            } else {
                System.out.print(" ");
            }
            System.out.print(absenti);
        }
    }
}
