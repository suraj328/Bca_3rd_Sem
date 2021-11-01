import java.util.Stack;

// 18) Write a program to push and pop items in and from stack.

public class Eighteen {
    public static void main(String[] args) {
        Stack<Integer> st1=new Stack<>();
        st1.push(0);
        st1.push(1);
        st1.push(2);
        st1.push(3);
        st1.push(4);
        st1.push(5);
        System.out.println("push:\n-"+st1);
        System.out.println("poping:\n-"+"your pop element is: "+st1.pop());
        System.out.println("your pop element is:"+st1.pop());
        System.out.println("your Stack Atfer poped is:"+st1);
    }
}
