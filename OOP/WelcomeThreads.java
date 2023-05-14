package OOP;

public class WelcomeThreads {
    public static void main(String[] args) {
        Thread name = new Thread(new Name());
        name.setPriority(1);

        Welcome welcome = new Welcome();
        welcome.setPriority(6);

        welcome.start();

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        name.start();
    }
}

class Name implements Runnable {
    public void run() {
        System.out.println("Please enter your name");
    }
}

class Welcome extends Thread {
    public void run() {
        System.out.println("Welcome!");
    }
}
