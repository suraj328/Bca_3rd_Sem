package com.company;

import java.util.Scanner;

public class Q25_CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number to check prime or not");
        int n=sc.nextInt();
        int c=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                c++;
            }
        }
        if(c==1){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not Prime Number");
        }
    }
}
