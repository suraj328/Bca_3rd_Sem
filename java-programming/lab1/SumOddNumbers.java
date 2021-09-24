package com.company;
//WAP to find sum of odd numbers from 1 to 100.
public class SumOddNumbers {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=100;i+=2){
            sum+=i;
        }
        System.out.println("the sum of odd number is "+sum);
    }
}
