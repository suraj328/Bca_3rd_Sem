package com.company;
//c. 100, 98, 96, 94, ............. Upto 10 terms.
public class Q19ReverseC {
    public static void main(String[] args) {
        int num = 100;
        for (int i = 1; i <= 10; i++) {
            System.out.println(num);
            num = num - 2;

        }
    }
}
