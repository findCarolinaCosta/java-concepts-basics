package OOP;

import java.util.Scanner;

abstract class Shape {
    int width;

    abstract void area();
}

class Square extends Shape {
    Square(int width) {
        this.width = width;
    }

    void area() {
        int area = width * width;
        System.out.println(area);
    }
}

class Circle extends Shape {
    Circle(int width) {
        this.width = width;
    }

    void area() {
        double area = Math.PI * width * width;
        System.out.println(area);
    }
}

public class ShapeProgram {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            Square a = new Square(x);
            Circle b = new Circle(y);
            a.area();
            b.area();
        }
    }
}
