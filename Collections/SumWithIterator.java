package Collections;

import java.util.Scanner;
import java.util.Iterator;
import java.util.LinkedList;

public class SumWithIterator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            LinkedList<Integer> nums = new LinkedList<Integer>();

            while (nums.size() < 5) {
                int num = scanner.nextInt();
                nums.add(num);
            }

            int sum = 0;
            Iterator<Integer> i = nums.iterator();

            while (i.hasNext()) {
                int s = i.next();
                sum += s;
            }

            // for (int s : nums) {
            // sum += s;
            // }

            System.out.println(sum);
        }
    }
}
