package Collections;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListsProgram {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            LinkedList<String> words = new LinkedList<String>();

            while (words.size() < 5) {
                String word = scanner.nextLine();

                words.add(word);
            }

            for (String w : words) {
                if (w.length() > 4) {
                    System.out.println(w);
                }
            }
        }

        // your code goes here

    }
}
