package OOP;

import java.util.Scanner;
import java.util.InputMismatchException;

public class MultipleExceptions {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            try {
                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();

                System.out.println(num1 / num2);
            } catch (ArithmeticException e) {
                System.out.println("Mistake: division by zero");
            } catch (InputMismatchException e) {
                System.out.println("Mistake: wrong value type");
            }
        }
    }
}