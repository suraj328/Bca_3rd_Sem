package com.company;
//23. WAP to print following Fibonacci series. 1, 1, 2, 3, 5, 8, ........ upto 15 terms.
public class Q23_fibonnaciSeris {
    public static void main(String[] args) {
        int temp,b=1,i,a=0,term=15;;

        System.out.print(a+","+b);
        for(i=1;i<=term-2;i++){
            temp=a+b;
            System.out.print(","+temp);
            a=b;
            b=temp;
        }
    }
}
