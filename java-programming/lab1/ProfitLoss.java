package com.company;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter cp");
        int cp= inp.nextInt();
        System.out.println("Enter sp");
        int sp= inp.nextInt();
        if(sp>cp){
           int p=sp-cp;
            System.out.println("Profit is "+p);
        }
        else {
            int loss=cp-sp;
            System.out.println("Loss is "+loss);
        }
    }
}
