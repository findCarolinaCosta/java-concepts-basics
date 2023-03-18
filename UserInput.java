import java.util.Scanner;

class UserInput {
    public static void main(String[] args) {
        Scanner myVar = new Scanner(System.in);
        System.out.println(myVar.nextLine());
        myVar.close();
    }
}