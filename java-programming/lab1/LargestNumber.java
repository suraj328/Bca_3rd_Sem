package com.company;

import java.util.Scanner;
//7. WAP to find largest among two numbers.
public class LargestNumber {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter Two Integer");
        System.out.println("first integer");
        int a= inp.nextInt();
        System.out.println("second integer");
        int b=inp.nextInt();
        if(a>b){
            System.out.println(a+" is greater");
        }
        else{
            System.out.println(b+" is greater");
        }
    }
}
