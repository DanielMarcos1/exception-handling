import java.util.InvalidPropertiesFormatException;
import java.util.Scanner;

public class UserException {
    public static void NumberChecker(int num) throws InvalidInputException {
         if(num < 100) {
             throw new InvalidInputException("Number is lower than 100");
         } else {
             System.out.println(num);
         }
    }
}
