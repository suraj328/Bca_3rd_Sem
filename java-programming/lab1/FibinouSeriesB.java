package com.company;
//b. 1, 4, 9, 16, ..... upto 20 terms.
public class FibinouSeriesB {
    public static void main(String[] args) {
        int temp,b=1,i,a=0,term=20;;

        System.out.print(a+","+b);
        for(i=1;i<=term-2;i++){
            temp=a+b;
            System.out.print(","+temp);
            a=b;
            b=temp;
        }
    }
}
