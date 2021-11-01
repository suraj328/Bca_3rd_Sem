
// 11) Write a program to demonstrate various methods of String Buffer class.
public class Eleven {
    public static void main(String[] args) {
        StringBuffer str= new StringBuffer("hello");
        str.append(" world");
        str.insert(2,'Y');
        System.out.println(str);
    }
    
}
