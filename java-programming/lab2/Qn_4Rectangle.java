package com.company;
//4) Define a class Rectangle with data members: length and breadth. Initialize its data
//members with some fixed values (i.e. say 100 and 200 for length and breadth
//respectively) using a constructor. Write a program to use an object of the class to
//calculate area of a rectangle.
class RectAngle{

    public RectAngle() {
        final int length=100;
        final int breadth=200;
        int area =length*breadth;
        System.out.println("the area of rectangle ia : "+area);
    }
}
public class Qn_4Rectangle {
    public static void main(String[] args) {
        RectAngle rect2= new RectAngle();

    }
}
