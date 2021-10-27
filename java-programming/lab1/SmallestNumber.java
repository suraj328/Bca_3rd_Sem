package com.company;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter Two Integer");
        System.out.println("first integer");
        int a= inp.nextInt();
        System.out.println("second integer");
        int b=inp.nextInt();
        if(a<b){
            System.out.println(a+" is Smallest");
        }
        else{
            System.out.println(b+" is Smallest");
        }
    }
}
