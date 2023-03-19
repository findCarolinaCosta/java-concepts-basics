package Arrays;

import java.util.Scanner;

public class SumElements {
    public static void main(String[] args) {
        int[] myArr = { 6, 42, 3, 7 };
        int sum = 0;
        for (int i = 0; i < myArr.length; i++) {
            sum += myArr[i];
        }
        System.out.println(sum);

        System.out.println("Execute sum multiples 4");
        sumMultiplesFour(args);
    }

    public static void sumMultiplesFour(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            if (i < length) {
                array[i] = scanner.nextInt();
            } else {
                break;
            }
        }
        scanner.close();

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 4 == 0) {
                sum += array[i];
            }
        }
        System.out.println("result: " + sum);
    }
}
