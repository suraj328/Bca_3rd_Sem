// 4) Write a program to demonstrate nested try block.
public class Four {
    public static void main(String[] args) {
        try {
            int numbers[] = { 0, 1, 2 };
            System.out.println("elemet of index is "+numbers[2]);
            try {

                int a = 5;
                int b = 0;
                int result = a / b;
                System.out.println("The divison of your given number is:" + result);

            } catch (ArithmeticException e) {
                System.out.println("Cannt divide by zer0");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("this array of index have none element");
        }
    }
}
