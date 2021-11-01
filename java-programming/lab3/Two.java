// 2) Write a program to handle following exceptions:
// a) Arithmetic b) NullPointer c) ArrayIndexOutOfBound
// d) StringIndexOutofBound e) NumberFormatException
public class Two {
    public static void main(String[] args) {

        float result;

        int a = 5;
        int b = 0;
        int numbers[] = { 0, 1, 2 };
        String str1 = "Hello Students";
        String str = null;

        try {
            result = a / b;
            System.out.println("The divison of your given number is:" + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannt divide by zer0");
        }
        try {
           
            System.out.println(str.equals("hello"));

        } catch (NullPointerException e) {
            System.out.println("Your string content is null");
        }
        try {
            System.out.println(numbers[4]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("this array of index have none element");
        }
        try {
            System.out.println(str1.length());
            System.out.println(str1.substring(16));

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("please enter valid string length");
        }
        try {
            int x = Integer.parseInt("300k");
            System.out.println(x);

        } catch (NumberFormatException e) {
            System.out.println("Number format exeption occured");
        } finally {
            System.out.println("your program work sucessfully");
        }

    }
}
