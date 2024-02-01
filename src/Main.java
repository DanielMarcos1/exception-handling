import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static int tests(int a) throws ArithmeticException {
        int i = a / 0;
        return i;
    }
    public static void main(String[] args) {

        // Tests of built-in exceptions
        try {
            String stringNullTest = null;
            System.out.println(stringNullTest.length());



        } catch (NullPointerException e) {
            System.out.println("The value of the string is null");
        }

        try {

            int num1 = 22;
            int num2 = 0;
            int calc = num1/num2;

        } catch (ArithmeticException f) {
            System.out.println("Cannot divide by zero");
        }

        try {
            int[] arrayException = new int[2];
            arrayException[3] = 2;
        } catch (ArrayIndexOutOfBoundsException g) {
            System.out.println("The array space doesn't exist");
        }

        try {
            throw new IOException("Demo");
        } catch (IOException e) {
            System.out.println("Caught IO threw exception");
        } finally { // Testing finally block
            System.out.println("I execute whatever it happens!");
        }

        try {
            tests(2);
        }
        catch(ArithmeticException a) {
            System.out.println("Are you dividing by 0 again? :/");
        }

        // Test of user made exception
        try {
            Scanner scan = new Scanner(System.in);

            System.out.println("Insert a number higher than 100: ");
            int number = scan.nextInt();
            UserException userException = new UserException();
            userException.NumberChecker(number);
        }
        catch(InvalidInputException a) {
            System.out.println(a.getMessage());
        }
        System.out.println("Program keeps the flow");
    }
}