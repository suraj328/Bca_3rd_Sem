package com.company;

import java.util.Scanner;

//10. WAP to find smallest among three numbers.
public class SmallestAmongThree {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter Three Integer");
        System.out.println("first integer");
        int a= inp.nextInt();
        System.out.println("second integer");
        int b=inp.nextInt();
        System.out.println("Third integer");
        int c=inp.nextInt();

        if(a<b && a<c){
            System.out.println(a+" is Smallest");
        }
        else if(b<c && b<a){
            System.out.println(b+" is Smallest");
        }
        else{
            System.out.println(c+" is Smallest");
        }
    }
}
