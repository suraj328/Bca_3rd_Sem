package com.company;

import java.util.Scanner;
//11. WAP to check whether a number is odd or even.
public class OddEven {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter Number for check");
        int a= inp.nextInt();
        if(a%2==0){
            System.out.println(a+" is Even number");
        }
        else{
            System.out.println(a+" is odd number");
        }
    }
}

