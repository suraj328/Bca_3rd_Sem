// 21) Write a program to generate random number in Java.
import java.util.Random;
public class TwenteyOne {
    public static void main(String[] args) {
        Random Ran=new Random();
        int num=Ran.nextInt(500);
        double num2=Ran.nextDouble();
        System.out.println("random number of integer:"+num);
        System.out.println("random number of double:"+num2);
    }
    
}
