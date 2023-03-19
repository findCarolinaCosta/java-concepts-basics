package OOP;

import java.util.Scanner;

public class numberRaised {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num1 = read.nextInt();
        int num2 = read.nextInt();

        System.out.println(Math.pow(num1, num2));
        read.close();
    }
}
