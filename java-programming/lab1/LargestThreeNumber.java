package com.company;

import java.util.Scanner;
//largest among three numbers.
public class LargestThreeNumber {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter Three Integer");
        System.out.println("first integer");
        int a= inp.nextInt();
        System.out.println("second integer");
        int b=inp.nextInt();
        System.out.println("Third integer");
        int c=inp.nextInt();

        if(a>b && a>c){
            System.out.println(a+" is greater");
        }
        else if(b>c && b>a){
            System.out.println(b+" is greater");
        }
        else{
            System.out.println(c+" is greater");
        }
    }
}
