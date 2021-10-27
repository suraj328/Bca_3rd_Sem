package com.company;



import java.util.Scanner;

//Create a class Polygon with data members to represent two dimensions and
//parameterized constructor to initialize data members. Derive two classes Rectangle
//and Triangle from Polygon class with appropriate member function to calculate area
//of each rectangle and triangle.
class PolygonMember{
    int dimension1;
    int dimension2;
    PolygonMember(){
        Scanner inp= new Scanner(System.in);
        System.out.println("Enter Dimension1");
        dimension1=inp.nextInt();
        System.out.println("Enter Dimension2");
        dimension2=inp.nextInt();
    }
}
class Rectangles extends PolygonMember{

    int RArea=dimension1*dimension2;
    void displayR(){
        System.out.println("Area of Rectangle is "+RArea);
    }
}
class Triangles extends PolygonMember{
    float TArea = ((float)1/2)*(dimension1*dimension2);
    void displayT(){
        System.out.println("Area of Triangle is "+TArea);
    }

}

public class Q15_CalculateArea {
    public static void main(String[] args) {
        System.out.println("*********For Rectangle*********");
        Rectangles obj = new Rectangles();
        obj.displayR();
        System.out.println("**********For Triangle***********");
        Triangles obt=new Triangles();
        obt.displayT();
    }

}
