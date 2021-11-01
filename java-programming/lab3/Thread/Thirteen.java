package Thread;
// Write a program to demonstrate thread by implementing Runnable interface.
public class Thirteen implements Runnable {
    public void run(){
        System.out.println("thread has ended");
    }
    public static void main(String[] args) {
        Thirteen obj=new Thirteen();
        Thread t1=new Thread(obj);
        t1.start();
        System.out.println("thread has started");
    }
    
}
