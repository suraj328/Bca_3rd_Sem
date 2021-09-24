package com.company;

import java.util.Scanner;

public class ProductTwoNumber {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter Two Integer");
        System.out.println("first integer");
        int a= inp.nextInt();
        System.out.println("second integer");
        int b=inp.nextInt();
        int pro=a*b;
        System.out.println("product of your number is="+pro);
    }
}
