package com.company;
//14) Write a program with two classes. Include a function with same name and same
//signature in each class to illustrate use of function overriding.
class ClassOne{
    void display(){
        System.out.println("I am from ClassOne");
    }
}
class ClassTwo extends ClassOne{
    //overriding function
    void display(){
        super.display();
        System.out.println("I am from ClassTwo");
    }
}
public class Q14_Overriding {
    public static void main(String[] args) {
    ClassTwo obj =new ClassTwo();
    obj.display();
    }
}
