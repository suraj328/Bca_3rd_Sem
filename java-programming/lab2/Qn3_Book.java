package com.company;
//Write a program which has class Book with data members book_name, ISBN, author
//& price and appropriate function members to read and display data members.

import java.util.Scanner;

public class Qn3_Book {
    String book_name;
    String ISBN;
    String author;
    int price;
    public void readData(String name,String isb,String auth,int pce){
        book_name=name;
        ISBN=isb;
        author=auth;
        price = pce;
    }
    public void displayData(){
        System.out.println("The name of book is: "+ book_name);
        System.out.println("The ISBN of book is: "+ISBN);
        System.out.println("The Author of book is: "+author);
        System.out.println("The price of book is: "+price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Book Name");
        String a=sc.nextLine();
        System.out.println("Enter ISBN number");
        String b=sc.nextLine();
        System.out.println("Enter Author name");
        String c=sc.nextLine();
        System.out.println("Enter Book price");
        int d=sc.nextInt();
        Qn3_Book book1=new Qn3_Book();
        book1.readData(a,b,c,d);
        book1.displayData();

    }
}
