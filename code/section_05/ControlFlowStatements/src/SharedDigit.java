/*
    Write a method named hasSharedDigit with two parameters of type int.
    Each number should be within the range of 10 (inclusive) - 99 (inclusive).
    If one of the numbers is not within the range, the method should return
    false.

    The method should return true if there is a digit that appears in both
    numbers, such as 2 in 12 and 23; otherwise, the method should return false.

    EXAMPLE INPUT/OUTPUT:

    * hasSharedDigit(12, 23); → should return true since the digit 2 appears in
      both numbers
    * hasSharedDigit(9, 99); → should return false since 9 is not within the
      range of 10-99
    * hasSharedDigit(15, 55); → should return true since the digit 5 appears in
      both numbers

    NOTE: The method hasSharedDigit should be defined as public static like we
          have been doing so far in the course.
    NOTE: Do not add a main method to the solution code.
 */

import java.util.HashSet;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.printf("Has shared digits [%s; %s]: %s;\n", 12, 23,
                hasSharedDigit(12, 23));
        System.out.printf("Has shared digits [%s; %s]: %s;\n", 9, 99,
                hasSharedDigit(9, 99));
        System.out.printf("Has shared digits [%s; %s]: %s;\n", 15, 55,
                hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit (int number1, int number2) {
        if (number1 < 10 || number1 > 99) return false;
        if (number2 < 10 || number2 > 99) return false;

        HashSet<Integer> baseDigits = new HashSet<Integer>();
        int baseNumber = 0;
        int checkNumber = 0;

        // Taking the least number as a base, so we have smaller HashSet.
        if (number1 <= number2) {
            baseNumber = number1;
            checkNumber = number2;
        } else {
            baseNumber = number2;
            checkNumber = number1;
        }

        while (baseNumber > 0) {
            baseDigits.add(baseNumber % 10);
            baseNumber /= 10;
        }

        while (checkNumber > 0) {
            if (baseDigits.contains(checkNumber % 10)) return true;
            checkNumber /= 10;
        }

        return false;
    }
}
