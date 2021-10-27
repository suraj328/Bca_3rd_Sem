package com.company;

import java.util.Scanner;

//WAP to area of rectangle. [area=l*b]
public class AreaRectangle {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter Length & breadth");
        System.out.println("Enter Length");
        int a= inp.nextInt();
        System.out.println("Enter Breadth");
        int b=inp.nextInt();
        int Area=a*b;
        System.out.println("Sum of your number is:"+Area);
    }
}
