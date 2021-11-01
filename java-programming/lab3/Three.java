import java.util.Scanner;

// 3) Write to program to demonstrate throw and throws keyword.
class CheckAge {
    CheckAge(){
        System.out.println("To execute throws program");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        int ag=sc.nextInt();
        Age(ag);

    }
    
    static void Age(int age) throws ArithmeticException {
        if(age<18){
            throw new ArithmeticException("You are not eligible for liscence");
        }
        else{
            System.out.println("you are eligible for liscence");
        }
        
    }
}

public class Three {
    public static void main(String[] args) {
        
        CheckAge check=new CheckAge();
        
    }
}
