package Thread;

class Twelve extends Thread {
    public void run() {
        System.out.println("Congratulation thread is working");
        
    }
    
    public static void main(String[] args) {
        Twelve obj=new Twelve();
        obj.start();
    }
    
}
