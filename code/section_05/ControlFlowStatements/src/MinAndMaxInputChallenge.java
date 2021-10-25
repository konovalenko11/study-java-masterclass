import java.util.Scanner;

/*
    -Read the numbers from the console entered by the user and print the minimum
     and maximum number the user has entered.
    -Before the user enters the number, print the message "Enter number:"
    -If the user enters an invalid number, break out of the loop and print the
     minimum and maximum number.

    Hint:
    -Use an endless while loop.

    Bonus:
    -Create a project with the name MinAndMaxInputChallenge.
 */
public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        int minNumber = 0;
        int maxNumber = 0;
        int countNumbers = 0;
        int inputNumber;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter number:");
            if (!scanner.hasNextInt()) break;

            inputNumber = scanner.nextInt();
            scanner.nextLine();

            countNumbers++;

            if (countNumbers == 1 || inputNumber < minNumber) {
                minNumber = inputNumber;
            }

            if (countNumbers == 1 || inputNumber > maxNumber) {
                maxNumber = inputNumber;
            }
        }

        scanner.close();

        System.out.println("Min: " + minNumber);
        System.out.println("Max: " + maxNumber);

    }
}
