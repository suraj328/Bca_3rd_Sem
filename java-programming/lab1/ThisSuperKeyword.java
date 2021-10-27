package com.company;
class SimpleClass{
    int a;
    SimpleClass(int a){
        this.a=a;
    }

    public int getA() {
        return a;
    }
}
class SimpleClass2 extends SimpleClass{
    SimpleClass2(int c){
        super(c);
        System.out.println("I am constructor");
    }
}
public class ThisSuperKeyword {
    public static void main(String[] args) {
        System.out.println("Lests start classes");
        SimpleClass e =new SimpleClass(5);
        SimpleClass2 f =new SimpleClass2(65);
        System.out.println(e.getA());
//        System.out.println(f.);
    }
}
