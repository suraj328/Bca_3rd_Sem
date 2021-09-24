package com.company;
//Write a program to define a class Circle with its data members pi and r and members
//functions getdata() for initializing data members and calculate() for finding area of
//ac circle. Return result from calculate() and display result in main() function. Use pi
//as constant.
import java.util.Scanner;

 class Circle{
    final float Pi=3.142f;
    int r;
    float Area;
    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
    public void display(){
       this.Area=Pi*(r*r);
        System.out.printf("The area of circle is: %.2f",Area);
    }

}
public class Qn9_AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Radius");
        int radius=sc.nextInt();
        Circle circle1=new Circle();
        circle1.setR(radius);
        circle1.display();

    }
}
