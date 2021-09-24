package com.company;

import org.w3c.dom.ls.LSOutput;

class one{
    public int y;
    public int meth1(){
        return 4;
    }
    public void meth2(){
        System.out.println("i am method2 from class one ");
    }
}
class two extends one{
    public void meth(){
        System.out.println("I am from class two");
    }
    public void meth2(){
        System.out.println("i am method2 from class two ");
    }

        }
public class MethodOveriding {
    public static void main(String[] args) {
        one a=new one();
            a.meth2();
        two b= new two();
        b.meth2();


    }
}
