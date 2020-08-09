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
        int myIntValue = 5;
        float myFloatValue = (float) 5.25;
        double myDoubleValue = 5d;
    }
}
