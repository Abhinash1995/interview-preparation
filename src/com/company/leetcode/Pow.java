package com.company.leetcode;

import java.util.Scanner;

public class Pow {
    public double myPow(double x, int n) {
        double result = 1;
        if(n>0){
            for(int i = 0; i<n; i++){
                result = result * x;
            }
        }else{
            int temp = Math.abs(n);
            double product = 1;
            for(int i = 0; i < temp; i++){
                product = product * temp;
            }
            result = 1/product;

        }
        return result;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base value X");
        double x = sc.nextDouble();

        System.out.println("Enter power  value n");
        int n = sc.nextInt();

        Pow pow = new Pow();
        double result = pow.myPow(x, n);
        System.out.println(result);
    }
}
