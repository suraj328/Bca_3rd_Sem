package com.company;
class Phones{

    public void greet(){
        System.out.println("Good Morning");
    }
    public void on() {
        System.out.println("turning on smart phones");
    }
}
class SmartPhones extends Phones{
    public void welcome() {
        System.out.println("Turning on smartphones");
    }
    public void on() {
        System.out.println("turning on smart phones from smartphone class");
    }
    public void play(){
        System.out.println("Playing");
    }
}
public class DispatchClass {
    public static void main(String[] args) {
//    Phones a =new Phones();
//    SmartPhones b=new SmartPhones();
//    a.name();
        Phones c=new SmartPhones();
        c.greet();
//        c.play();

    }
}
