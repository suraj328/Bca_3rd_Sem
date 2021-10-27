package com.company;
//6) Write a program of your choice to show the implementation of this keyword.
class ThisKeyword{
    String Str1;
     ThisKeyword(String Str1){
       this. Str1=Str1;
    }
    void display(){
        System.out.println(Str1);
    }
}
public class Qn_6ThisKeyword {
    public static void main(String[] args) {
        ThisKeyword key= new ThisKeyword("This Keyword is running");
        key.display();
    }
}
