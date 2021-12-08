package arrays;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        myIntArray[5] = 50;

        System.out.println(myIntArray[5]);

        double[] myDoubleArray = new double[10];
        System.out.println(myIntArray[4]);

        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = i * 10;
        }

        int[] myIntegers = getIntegers(5);

        for (int myInteger : myIntegers) {
            System.out.printf("Element[%s]: %s\n", myInteger,
                    myInteger);
        }

        System.out.printf("Average is: %s", getAverage(myIntegers));
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return (double) sum / array.length;
    }
}