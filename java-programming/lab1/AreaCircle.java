package com.company;

import java.util.Scanner;

//WAP to find area of circle. [area=pi*r*r] (use pi as constant)
public class AreaCircle {
    public static void main(String[] args) {
    final float pi=3.14f;
        Scanner inp=new Scanner(System.in);
        
        System.out.println("Enter radius of circle");
        int a= inp.nextInt();
        a*=a;
        float Area=pi*a*1f;
        System.out.println(Area);

    }
}
