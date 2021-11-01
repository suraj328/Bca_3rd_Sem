// 10) Write a program to demonstrate modification of string using substring(), replace(),
// concat() and trim() methods.
public class Ten {
    public static void main(String[] args) {
        String str="   Java Programers  ";
        String substr="";
        substr=str.substring(4, 8);
        System.out.println("Substring:\n-"+substr);
        System.out.println("replace():\n-"+str.replace('P', 'Q'));
        System.out.println(" concat():\n-"+str.concat(" ready ").concat("forever"));
        System.out.println("Trim:\n-"+"white space removed from both sides: "+str.trim());

    }
    
}
