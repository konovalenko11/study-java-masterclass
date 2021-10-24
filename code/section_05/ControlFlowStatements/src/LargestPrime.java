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
        int result;

        int number = 2100000001;

        // Method 1.
        startTime = System.nanoTime();
        result = getLargestPrime(number);
        endTime = System.nanoTime();

        duration = (double)(endTime - startTime) / 1_000_000;  // milliseconds.

        System.out.printf("Result: %s\n", result);
        System.out.println("Duration: " + duration + " ms");

        // Method 2.
        startTime = System.nanoTime();
        result = getLargestPrime2(number);
        endTime = System.nanoTime();

        duration = (double)(endTime - startTime) / 1_000_000;  // milliseconds.

        System.out.printf("Result: %s\n", result);
        System.out.println("Duration: " + duration + " ms");

        // Method 3. Jules.
        startTime = System.nanoTime();
        result = getLargestPrime3(number);
        endTime = System.nanoTime();

        duration = (double)(endTime - startTime) / 1_000_000;  // milliseconds.

        System.out.printf("Result: %s\n", result);
        System.out.println("Duration: " + duration + " ms");

    }

    public static int getLargestPrime (int number) {
        // Numbers before 1 don't have prime divisors.
        if (number <= 1) return -1;

        int checkNumber = number;
        int maxPrimeDivisor = -1;

        while (checkNumber > maxPrimeDivisor) {
            if (checkNumber % 2 == 0) {
                checkNumber /= 2;
                maxPrimeDivisor = 2;
                continue;
            }

            for (int i = 3; i <= checkNumber; i += 2) {
                if (checkNumber % i == 0) {
                    checkNumber /= i;
                    maxPrimeDivisor = i;
                    break;
                }
            }
        }

        return maxPrimeDivisor;
    }

    public static int getLargestPrime2 (int number) {
        // Numbers before 3 don't have prime divisors.
        if (number <= 1) return -1;

        int checkNumber = number;
        int maxPrimeDivisor = -1;
        int divisor = 2;

        if (checkNumber % 2 == 0) maxPrimeDivisor = 2;

        while (checkNumber % 2 == 0) {
            checkNumber /= divisor;
        }

        divisor = 3;

        while (checkNumber >= divisor) {
            if (checkNumber % divisor == 0) {
                checkNumber /= divisor;
                maxPrimeDivisor = divisor;
                continue;
            }

            divisor += 2;
        }

        return maxPrimeDivisor;
    }

    public static int getLargestPrime3(int number){ // number = 21
        if(number <= 1){
            return -1;
        }
        for(int i=number-1; i>=2; i--){ // i=20, i = 19, ... i = 7

            if(number%i == 0){ // false, false,true
                number = i;// number = 7
                if (getLargestPrime(number) < 2){
                    return number;
                } else return getLargestPrime(number);
            }
            if (number == i){ // false, false, true
                return i; // 7
            }
        }
        return number;
    }

    public static ArrayList<Integer> getPrimeNumbers (int number) {
        ArrayList<Integer> primeNumbers = new ArrayList<>();

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
