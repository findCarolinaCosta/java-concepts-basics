package loops;

import java.util.Scanner;

public class SquareAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] sides = new int[5];
        for (int i = 0; i < length; i++) {
            if (i < length) {
                sides[i] = scanner.nextInt();
                System.out.println(sides[i] * sides[i]);
            } else {
                break;
            }
        }
        scanner.close();
    }
}
