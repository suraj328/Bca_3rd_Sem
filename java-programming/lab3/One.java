
// 1) Write a program to demonstrate exception handling using try, catch and finally
// block.
import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float result;
        System.out.println("Enter two number for integer");
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            result = (a * 1f) / (b * 1f);
            System.out.println("The divison of your given number is:" + result);
        } catch (Exception e) {
            System.out.println("Cannt divide by zer0");
        } finally {
            System.out.println("your program work sucessfully");
        }
        sc.close();
    }

}