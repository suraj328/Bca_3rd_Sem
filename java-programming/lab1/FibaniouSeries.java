package com.company;
//19. WAP to print following series.
//a. 5, 10, 15, 20, ...... 50
public class FibaniouSeries {
    public static void main(String[] args) {
        int temp,b=1,i;
        int a=0;
        System.out.print(a+","+b);
        for(i=0;i<9;i++){
            temp=a+b;
            System.out.print(","+temp);
            a=b;
            b=temp;
        }
    }
}
