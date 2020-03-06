public class MoreVariables {

    public static void sayHello(String name) {
        System.out.println("Hello " + name + "!");
    }
    public static void main(String[] args) {
        sayHello("Jorik");

        int myFirstNumber = (5 * 10) + (int)(2 / 0.5);
        int mySecondNumber = 30;
        int myThirdNumber = myFirstNumber * 2;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.printf("My total: [%d]%n", myTotal);

        int myLastNumber = myTotal - 1000;
        System.out.printf("My last number: [%d]", myLastNumber);

    }
}
