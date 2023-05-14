package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListProgram {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<Integer> nums = new ArrayList<Integer>();
            int sum = 0;
            while (nums.size() < 3) {
                int num = scanner.nextInt();
                nums.add(num);
                sum += num;

            }

            System.out.print(sum / 3);
        }
    }
}
