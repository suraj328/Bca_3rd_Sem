import java.util.Vector;

public class Nineteen {
    public static void main(String[] args) {
        Vector <Integer> vect=new Vector<>();
        for(int i=0;i<10;i++){
            vect.add(i);
        }
        System.out.println("Element:"+vect);
        for(int i=1;i<5;i++){
            vect.remove(i);
        }
        System.out.println("After removing element:"+vect);
    }
    
}
