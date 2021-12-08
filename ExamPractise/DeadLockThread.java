class drink{

}
class water{

}
public class DeadLockThread {
    public static void main(String[] args) {
        final drink dr=new drink();
        final water wr =new water();
        Thread t1 =new Thread(){
            public void run(){
                synchronized(dr){
                    System.out.println("i am drinking");
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        System.out.println("thread 1 got dead");

                    }
                    synchronized(wr){
                        System.out.println("water starts requesting");
                    }
                }
            }
        };

        Thread t2= new Thread(){
            public void run(){
                synchronized(wr){
                    System.out.println("i am water");
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        System.out.println("thread 2 dead");
                    }
                    synchronized(dr){
                        System.out.println("drink starts requesting");
                    }
                }
            }
        };
        t1.start();
        t2.start();
    }
}
