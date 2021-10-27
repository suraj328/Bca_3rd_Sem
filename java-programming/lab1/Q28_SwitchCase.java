package com.company;

import java.util.Scanner;

public class Q28_SwitchCase {
    public static void main(String[] args) {
        System.out.println("Enter two integer");
        Scanner inp=new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();

        System.out.println("1.sum   \n2.multiply");

        int choice = inp.nextInt();
        switch(choice){
            case 1:
                System.out.println("sum is"+(a+b));
                break;
            case 2:
                System.out.println("prodeuct="+(a*b));
                break;
            default:
                System.out.println("not valid choice");
        }
    }
}
