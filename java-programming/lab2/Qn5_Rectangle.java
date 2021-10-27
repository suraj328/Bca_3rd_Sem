package com.company;

import java.util.Scanner;

//5) Modify above program to read length and breadth of a rectangle in main() function
//and supply them in parameterized constructor to initialize its data members.
class Rectangle{
    int area,length,breadth;

    Rectangle(int l,int b) {
        length=l;
        breadth=b;

    }
    void getArea(){
        area=length*breadth;
        System.out.println("Area Of Rectangle is"+area);
    }
}

public class Qn5_Rectangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Length");
        int a=sc.nextInt();
        System.out.println("Enter breadth");
        int b=sc.nextInt();
        Rectangle rect1=new Rectangle(a,b);
        rect1.getArea();

    }
}
