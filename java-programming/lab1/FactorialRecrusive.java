package com.company;

import java.util.Scanner;

public class FactorialRecrusive {
    static int factorial(int x){
        if(x==1||x==0){
        return 1;
        }
        else{
            return x*factorial(x-1);
        }
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter Number for factorial");
        int a= inp.nextInt();
        System.out.println(factorial(a));
    }
}
