// 8) Write a program to demonstrate string comparison using equals() and compareTo()
// methods.
public class Eight {
    public static void main(String[] args) {
        String str1="programmers";
        String str2="programmers";
        
        if (str1.equals(str2)) {
            System.out.println("your both string are same");
        } else {
            System.out.println("your string doesnot match");
        }
        System.out.println("Compare To:");
        System.out.println(str1.compareTo(str2));
    }
    
}
