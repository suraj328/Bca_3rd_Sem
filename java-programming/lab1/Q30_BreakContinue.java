package com.company;

public class Q30_BreakContinue {
    int print(int i) {
        System.out.println("Prime number:" + i);
        return i;
    }

    public static void main(String[] args) {
        Q30_BreakContinue obj = new Q30_BreakContinue();
        for (int i = 1; i < 10; i++) {
            if (i == 6) {
                break;
            }
            if (i % 2 == 0) {
                continue;
            }
            int result = obj.print(i);
            System.out.println("returned form method    " + result);
        }
    }
}
