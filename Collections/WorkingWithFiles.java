package Collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class WorkingWithFiles {
    public static void main(String[] args) {
        File x = new File("./test.txt");

        if (x.exists()) {
            System.out.println(x.getName() + " exists!");
            readFile();
        } else {
            System.out.println("The file doesn't exist");
            createFile();
        }
    }

    public static void readFile() {
        File x = new File("./test.txt");
        try (Scanner sc = new Scanner(x)) {
            while (sc.hasNext()) {
                System.out.println(sc.next());
            }
            sc.close();

            System.out.println(sc);
        } catch (FileNotFoundException e) {
            System.out.println("Erro ao criar o arquivo: " + e.getMessage());
        }
    }

    public static void createFile() {
        try {
            Formatter f = new Formatter("./test.txt");
            f.format("%s %s %s", "1", "John", "Smith \r\n");
            f.format("%s %s %s", "2", "Amy", "Brown");
            f.close();

            readFile();

        } catch (IOException e) {
            System.out.println("Erro ao criar o arquivo: " + e.getMessage());
        }
    }
}
