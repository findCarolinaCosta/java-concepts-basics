import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        int remainingAmount = amount;
        int i = 1;

        while (i <= 3) {
            remainingAmount -= remainingAmount * 0.1;
            i++;
        }

        System.out.println((int) remainingAmount);
        scanner.close();

    }
}