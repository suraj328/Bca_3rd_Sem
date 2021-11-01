package Thread;
// 12) Write a program to demonstrate thread by extending Thread class.
class Twelve extends Thread {
    public void run() {
        System.out.println("Congratulation thread is working");
        
    }
    
    public static void main(String[] args) {
        Twelve obj=new Twelve();
        obj.start();
    }
    
}
