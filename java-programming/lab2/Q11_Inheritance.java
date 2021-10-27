package com.company;

import java.util.Scanner;

//Create a class named Person which has name & age as data members and
//appropriate function members to read and display its data. Create another class
//Employee derived from class Person to use features of base class (single).
class person{
    String name;
    int age;
}
class person1 extends person{
    public void setData(String name,int age){
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println("name : "+name+"\nage : "+age);
    }
}
public class Q11_Inheritance {
    public static void main(String[] args) {
    person1 hari=new person1();
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter Person name");
    String name= sc.next();
    System.out.printf("Enter %s's age",name);
    int age=sc.nextInt();
    hari.setData(name,age);
    hari.display();
    }
}
