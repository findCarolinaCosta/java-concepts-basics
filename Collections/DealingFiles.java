package Collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Formatter;

public class DealingFiles {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            try {
                Formatter f = new Formatter("tasks.txt");
                int count = 0;
                while (count < 3) {
                    String x = input.nextLine();
                    f.format(x + '\n');
                    count++;
                }
                f.close();
            } catch (IOException e) {
                System.out.println("Erro ao criar o arquivo: " + e.getMessage());
            }
            readFile();
        }
    }

    public static void readFile() {
        try {
            File x = new File("tasks.txt");
            Scanner sc = new Scanner(x);
            while (sc.hasNext()) {
                System.out.println(sc.next());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Erro ao criar o arquivo: " + e.getMessage());
        }
    }
}
