// 6) Write a program to input any string and convert it to uppercase and lowercase.
import java.util.Scanner;
public class Six {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Your String");
        String str=sc.nextLine();
        System.out.println("Upercase");
        System.out.println(str.toUpperCase());
        System.out.println("Lowercase:");
        System.out.println(str.toLowerCase());
        sc.close();
    }
}
