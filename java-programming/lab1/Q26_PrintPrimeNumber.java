package com.company;



public class Q26_PrintPrimeNumber {
    public static void main(String[] args) {
        System.out.println("prime numbers are:-");
        int c=0;
        for(int j=1;j<=100;j++){
            for(int i=1;i<=j/2;i++){
                if(j%i==0){
                    c++;
                }

            }
            if(c<2){
                System.out.println(j);
            }
            c=0;
        }

    }
}
