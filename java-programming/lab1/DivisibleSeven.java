package com.company;

import java.util.Scanner;
//WAP to check whether a number is divisible by 7 or not.
public class DivisibleSeven {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter Number for check");
        int a= inp.nextInt();
        if(a%7==0){
            System.out.println(a+" is Divisible by 7");
        }
        else{
            System.out.println(a+" is not divisible by 7.");
        }
    }
}
