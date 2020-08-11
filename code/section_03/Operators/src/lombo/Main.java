package lombo;

public class Main {

    public static void main(String[] args) {
	    int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        System.out.println("Previous Result = " + previousResult);

        result = result - 1;
        System.out.println("3 - 1 = " + result);
        System.out.println("Previous Result = " + previousResult);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3; // 4 % 3 = 1
        System.out.println("4 % 3 = " + result);

        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        result += 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        result /= 3; // 30 / 3 = 10
        System.out.println("30 / 3 = " + result);

        result -= 2; // 10 - 2 = 8
        System.out.println("10 - 2 = " + result);

        // Conditions
        boolean isAlien = false;
        if (!isAlien) {
            System.out.println("It is not an alien!");
        }

        int topScore = 100;
        if (topScore >= 100) {
            System.out.println("You got the high score!");
        }

        topScore = 80;
        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are True!");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true.");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen!");
        }
    }
}
