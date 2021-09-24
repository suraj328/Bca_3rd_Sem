package com.company;
//Write a program to define a class with its data members and function members. Use
//object of this class in main program to access its members.
public class Qn1_DefineClass {
    String word;
    void myMethod(String word){
        this.word=word;
    }
    public static void main(String[] args) {
        Qn1_DefineClass str= new Qn1_DefineClass();


        str.myMethod("Object is printed from main program");

        System.out.println(str.word);
    }

}
