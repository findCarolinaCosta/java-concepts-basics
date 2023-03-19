package OOP;

import java.util.Scanner;

public class ConvertNumberToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print(Converter.toBinary(x));
        sc.close();
    }
}

class Converter {
    public static String toBinary(int number) {
        if (number == 0) {
            return "0";
        }
        StringBuilder binary = new StringBuilder();
        while (number > 0) {
            int remainder = number % 2;
            binary.append(remainder);
            number /= 2;
        }
        return binary.reverse().toString();
    }
}
