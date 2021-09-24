package com.company;

import java.util.Scanner;

//14. WAP to check whether  a number is divisible by 7 but not by 13.
public class Divisible5AndNot13 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter Number for check");
        int a= inp.nextInt();
        if(a%7==0){
            System.out.println(a+" is divisible by 7.");
        }
        else if(a%13!=0){
            System.out.println(a+" is not divisible by 13. ");
        }

    }
}
