// 7) Write a program to demonstrate character extraction using charAt() and getChars()
// methods.

public class Seven {
    public static void main(String[] args) {
        String str=new String("Hello World Begineers");
        System.out.print("CharAt:\n"+"The index element of 2 is: "+str.charAt(2));
        char[]str2=new char[9];
        str.getChars(2, 7, str2, 0);
        System.out.print("\ngetChars:\n"+"your coppied character is: ");
        System.out.println(str2);
    }
    
}
