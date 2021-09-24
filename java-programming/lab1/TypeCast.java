package com.company;

public class TypeCast {
    public static void main(String[] args) {
        System.out.println("Integer to String");
        int a=850;
        String str1=Integer.toString(a);
        System.out.println(str1);
        System.out.println(str1.getClass().getName());
        System.out.println("String to Integer");
        String b="300";
        int inti=Integer.parseInt(b);
        System.out.println(str1.getClass().getName());
        System.out.println(inti);
        System.out.println("Integer to Double");
        int i=500;
        Double d=new Double(i);
        System.out.println(d);
        System.out.println("Double to Integer");
        double n=3050.5960;
        int j=(int) n;
        System.out.println(j);
        System.out.println("String to Double");
        String s="3068.9632";
        double z =Double.parseDouble(s);
        System.out.println(z);
        System.out.println("Double to String");
        double g=1986.365;
        String str2=String.valueOf(g);
        System.out.println(str2);
    }
}
