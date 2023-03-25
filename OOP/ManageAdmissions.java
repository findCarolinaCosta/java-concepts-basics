package OOP;

import java.util.Scanner;

public class ManageAdmissions {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();

        Pupil pupil = new Pupil();
        pupil.setAge(a);

        read.close();
    }
}

class Pupil {
    private int age;

    // complete setter method
    public void setAge(int a) {
        if (a > 6) {
            age = a;
            System.out.println("Welcome");
        } else {
            System.out.println("Sorry");
        }
    }

    public int getAge() {
        return age;
    }
}