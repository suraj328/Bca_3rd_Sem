package com.company;

import java.util.Scanner;

//Write a program to define a class named Box which has data length, breadth and
// height and public functions ReadData() for reading data members and Volume() to
//  calculate volume of box.
class Box{
    int length;
    int breadth;
    int height;
    int volume;

    public void readData(int len,int bre,int hei) {
        length=len;
        breadth=bre;
        height=hei;
    }


    public void printVolume() {
        this.volume=length*breadth*height;

        System.out.println(volume);
    }
}
public class Qn2_VolumeOfBox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length");
        int a=sc.nextInt();
        System.out.println("Enter Breadth");
        int b=sc.nextInt();
        System.out.println("Enter Height");
        int c=sc.nextInt();
    Box box1=new Box();
    box1.readData(a,b,c);
    box1.printVolume();

    }
}
