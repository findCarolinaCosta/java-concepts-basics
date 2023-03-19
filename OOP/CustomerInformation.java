package OOP;

import java.util.Scanner;

public class CustomerInformation {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String firstName = read.nextLine();
        String secondName = read.nextLine();
        int age = read.nextInt();
        int roomNumber = read.nextInt();
        Customer customer = new Customer(firstName, secondName, age, roomNumber);

        customer.saveCustomerInfo();

        read.close();
    }
}

class Customer {
    private String firstName;
    private String secondName;
    private int age;
    private int roomNumber;

    /* Constructor methods with same name of the Class */
    public Customer(String firstName, String secondName, int age, int roomNumber) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.roomNumber = roomNumber;
    }

    public void saveCustomerInfo() {
        System.out.println("First name: " + this.firstName);
        System.out.println("Second name: " + this.secondName);
        System.out.println("Age: " + this.age);
        System.out.println("Room number: " + this.roomNumber);
    }
}
