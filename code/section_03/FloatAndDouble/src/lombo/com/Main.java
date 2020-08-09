package lombo.com;

public class Main {

    public static void main(String[] args) {
        // Ranges
	    float myMinFloatValue = Float.MIN_VALUE;
	    float myMaxFloatValue = Float.MAX_VALUE;

        System.out.printf("Float MIN: [%s];%nFloat MAX: [%,.2f];%n", myMinFloatValue, myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.printf("Double MIN: [%s];%nDouble MAX: [%s]%n", myMinDoubleValue, myMaxDoubleValue);

        // Initialization
        // Note: Double is the default type with precision.
        int myIntValue = 5 / 3;
        float myFloatValue = (float) 5 / 3f;
        double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue: [" + myIntValue + "]");
        System.out.println("myFloatValue: [" + myFloatValue + "]");
        System.out.println("myDoubleValue: [" + myDoubleValue + "]");

        // Challenge: Convert given number of pounds to kilograms.
        double pounds = 12.52;
        double kilos = poundToKilo(pounds);

        System.out.println("Pounds: [" + pounds + "] -> Kilos: [" + kilos + "].");

        // Output
        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_5674444_890d;

        System.out.println("PI: [" + pi + "].");
        System.out.println("Another Number: [" + anotherNumber + "].");
    }

    public static double poundToKilo(double pounds){
        return pounds * 0.45359237;
    }
}
