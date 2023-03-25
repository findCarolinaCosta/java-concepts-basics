package OOP;

import java.util.Scanner;

public class FixCasting {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        char a = read.next().charAt(0);
        int b = (int) a;
        System.out.println(b);
        read.close();
    }
}
