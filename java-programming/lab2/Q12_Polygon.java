package com.company;


import java.util.Scanner;

//Create a class Polygon with data members: dimension1 and dimension2 and a
//member function: ReadDimension() to read data members. Derive two classes
//Rectangle and Triangle from Polygon class with appropriate member function to
//calculate area of each rectangle and triangle (multilevel).
class Polygon{
    int dimension1;
    int dimension2;
    void readData(int dimension1,int dimension2){
        this.dimension1=dimension1;
        this.dimension2=dimension2;

    }
}
class Triangle extends Polygon{
    void areaTriangle(){
        float TArea =((float)1/2)*(dimension1*dimension2);
        System.out.println("The area of triangle is: "+TArea);


    }
}
class Rectngle extends Triangle{
    void areaRectangle(){
        System.out.println("THe area of rectangle is: "+dimension1*dimension2);
    }
        }
public class Q12_Polygon {
    public static void main(String[] args) {

        Rectngle area1=new Rectngle();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Dimension1");
        int D1 =sc.nextInt();
        System.out.println("Enter Dimension2");
        int D2 =sc.nextInt();
        area1.readData(D1,D2);
        area1.areaTriangle();
        area1.areaRectangle();

    }
}
