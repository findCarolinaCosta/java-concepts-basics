package OOP;

public class HelloWorld {
    public static void main(String[] args) {
        sayHelloWorlld();
        sayHelloTo("Carol");
    }

    private static void sayHelloWorlld() {
        System.out.println("Hello World!");
    }

    private static void sayHelloTo(String name) {
        System.out.println("Hello " + name);
    }
}
