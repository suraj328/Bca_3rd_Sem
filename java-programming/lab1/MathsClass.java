package com.company;

import java.util.Scanner;

//WAP to add, subtract, multiply and divide two numbers.
public class MathsClass {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter Two Integer");
        System.out.println("first integer");
        int a= inp.nextInt();
        System.out.println("second integer");
        int b=inp.nextInt();
        float total =(a*1f)/(b*1f);
        System.out.printf("sum of two numbers is%d\n",a+b);
        System.out.printf("divison of two numbers is%.2f\n",total);
        System.out.printf("product of two numbers is%d\n",a*b);
        System.out.printf("subtraction of two numbers is%d\n",a-b);



    }
}
