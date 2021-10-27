package com.company;
//16) Write a program of your choice to implement multiple inheritance using interface.
interface Network {
    default void hello(){
        System.out.println(" i am default interface from network interface");
    }
    void smartCell();
    void nTC();
}
interface Camera{
    void pixel();
    void lens();
}
interface CameraFeatures extends Camera{
    void photos();
    void videos();
}
class SmartPhone implements Network,CameraFeatures{
    public void smartCell(){
        System.out.println("SmartCell network is supported");
    }
    public void nTC(){
        System.out.println("NTC network is supported");
    }
    public void pixel(){
        System.out.println("48 Mp camera");
    }
    public void lens(){
        System.out.println("sony Imx sensor");
    }
    public void photos(){
        System.out.println("Hd resolution");
    }
    public void videos(){
        System.out.println("support 4k recording");
    }
}
public class Q16_MultipleInheritanceUsingInterface {
    public static void main(String[] args) {
        System.out.println("-----------SmartPhone Details-----------");
    SmartPhone obj=new SmartPhone();
        obj.smartCell();
        obj.nTC();
        obj.pixel();
        obj.lens();
        obj.photos();
        obj.videos();
        System.out.println("Interface Network");
        obj.hello();
    }
}
