package com.company;

import java.util.Scanner;

public class Divisible5And7 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter Number for check");
        int a= inp.nextInt();
        if(a%5==0){
            System.out.println(a+" is divisible by 5.");
        }
        else if(a%7==0){
            System.out.println(a+" divisible by 5 and 7.");
        }
        else{
            System.out.println("its not divisible by 5 and 7");
        }
    }
}
