package com.company;
//10) Write a program to implement encapsulation using getter and setter methods.
public class Q10_GetterSetter {
    String value;

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
    public void Display(){
        System.out.println(value);
    }

    public static void main(String[] args) {
        Q10_GetterSetter class1=new Q10_GetterSetter();
        class1.setValue("The getter and setter value is implemented.");
        System.out.println(class1.getValue());
    }
}
