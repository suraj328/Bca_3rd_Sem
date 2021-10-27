package com.company;

import java.util.Scanner;
//4. WAP to find simple interest. [si=(p*t*r)/100]

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter Your Simple interest accordingly");
        System.out.println("Enter principal");
        int p= inp.nextInt();
        System.out.println("Enter Time");
        int t=inp.nextInt();
        System.out.println("Enter Rate");
        int r=inp.nextInt();
        int product=p*t*r;
        float si=product/100f;
        System.out.println("simple Interest of your given amount is:"+si);
    }
}
