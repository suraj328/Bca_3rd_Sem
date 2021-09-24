package com.company;
//7) Write a program which has two functions with same name, one for addition of two
//integers and other for addition of three integers.
public class Qn8_MethodOverloading {
    void sumMethod(int x,int y){
        System.out.println(x+y);
    }
    void sumMethod(int x,int y,int z){
        System.out.println(x+y+z);
    }
    public static void main(String[] args) {
        Qn8_MethodOverloading sum1=new Qn8_MethodOverloading();
        System.out.println("sum of two integer");
        sum1.sumMethod(4,5);
        System.out.println("sum of three integer");
        sum1.sumMethod(6,3,9);
    }
}
