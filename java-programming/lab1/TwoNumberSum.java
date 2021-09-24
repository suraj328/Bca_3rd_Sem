package com.company;
import java.util.Scanner;
//1. WAP to find sum of two numbers.
class TwoNumberSum {

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter Two Integer");
        System.out.println("first integer");
        int a= inp.nextInt();
        System.out.println("second integer");
        int b=inp.nextInt();
        int sum=a+b;
        System.out.println("Sum of your number is:"+sum);
    }
}
