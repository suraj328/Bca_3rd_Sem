class MyException extends Exception{
    int a=2;
    MyException( int b){
        a=b;
    }
    public String toString() {
        return("Exception:::"+a);
    }
}
public class UserDefinedException {
    public static void main(String[] args) {
        try {
            throw new MyException(5);
        } catch (Exception e) {
            System.out.println("Exception:"+e);
        }
        
    }
}