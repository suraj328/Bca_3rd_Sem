package com.company;
//17) Write a program to implement abstract class and final class to achieve abstraction.

public class Q16_AbstractFinal {
    public static void main(String[] args) {
        Child obj =new Child();
        Child2 obj2 =new Child2();
        System.out.println("-----child-----");
        obj.greet();
        obj.location();
        System.out.println("------child2-----");
        obj2.greet();
        obj2.location();
        System.out.println("---------Final class result----------");
        MyLogin obj3=new MyLogin();
        System.out.println("Email:"+obj3.id);
        System.out.println("password:"+obj3.Password);
    }
}
abstract class Parent{
    abstract void greet();
    abstract void  location();
}
class Child extends Parent{
    void greet(){
        System.out.println("Good morning");
    }
    void location(){
        System.out.println("I am from child class");
    }
}
class Child2 extends Parent{
    void greet(){
        System.out.println("Good evening");
    }
    void location(){
        System.out.println(" I am from child 1 class");
    }
}
final class MyLogin{
    int a=5;
//    a=6;   we cannot change value in final class it refer for constant object.
    String id="omen15@gmail.com";
    String Password="omen159";
}

