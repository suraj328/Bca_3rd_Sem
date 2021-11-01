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
class Num{
    void display(){
    int num=0;
    
    int num2=5;
    if (num==0) {
        throw new ArithmeticException("can not divide by zero");
    } else {
        int result=num2/num;
        System.out.println("divison:"+result);
    }
    }
}
public class Three {
    public static void main(String[] args) {
        
        CheckAge check=new CheckAge();
        Num nu=new Num();
        nu.display();
    }
}
