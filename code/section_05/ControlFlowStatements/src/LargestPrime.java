/*
    Write a method named getLargestPrime with one parameter of type int named
    number.
    If the number is negative or does not have any prime numbers, the method
    should return -1 to indicate an invalid value.
    The method should calculate the largest prime factor of a given number and
    return it.

    EXAMPLE INPUT/OUTPUT:

    * getLargestPrime (21); should return 7 since 7 is the largest prime
      (3 * 7 = 21)
    * getLargestPrime (217); should return 31 since 31 is the largest prime
      (7 * 31 = 217)
    * getLargestPrime (0); should return -1 since 0 does not have any prime
      numbers
    * getLargestPrime (45); should return 5 since 5 is the largest prime
      (3 * 3 * 5 = 45)
    * getLargestPrime (-1); should return -1 since the parameter is negative

    HINT: Since the numbers 0 and 1 are not considered prime numbers, they
          cannot contain prime numbers.
    NOTE: The method getLargestPrime should be defined as public static like we
          have been doing so far in the course.
    NOTE: Do not add a main method to the solution code.
 */

import java.util.ArrayList;

public class LargestPrime {
    public static void main(String[] args) {
        long startTime, endTime;
        double duration;
        ArrayList<Integer> result;

        int number = 1000000;

        // Method 1. Simple.
        startTime = System.nanoTime();
        result = getPrimeNumbers(number);
        endTime = System.nanoTime();

        duration = (double)(endTime - startTime) / 1_000_000;  // milliseconds.

        System.out.printf("Result: [%s] - %s\n", result.size(), result);
        System.out.println("Duration: " + duration + " ms");

    }

    public static int getLargestPrime (int number) {
        if (number <= 1) return -1;

        return -1;
    }

    public static ArrayList<Integer> getPrimeNumbers (int number) {
        ArrayList<Integer> primeNumbers = new ArrayList<Integer>();

        // Numbers less than 1 don't have prime numbers.
        if (number <= 1) return primeNumbers;

        // Adding "2" as the lowest prime number.
        primeNumbers.add(2);

        boolean isPrime;

        for (int i = 3; i <= number; i += 2) {
            isPrime = true;
            for (int p : primeNumbers) {
                if (i % p == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primeNumbers.add(i);
            }
        }

        return primeNumbers;
    }
}
