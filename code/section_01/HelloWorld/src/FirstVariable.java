public class FirstVariable {

    public static void sayHello(String name) {
        System.out.println("Hello " + name + "!");
    }
    public static void main(String[] args) {
        sayHello("Jorik");

        int myFirstVariable = (5 * 10) + (int)(2 / 0.5);
        System.out.printf("My first variable: [%d]", myFirstVariable);

    }
}
