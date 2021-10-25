import java.time.Year;
import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yearOfBirth = 1900;

        System.out.println("Enter your year of birth: ");
        if (scanner.hasNextInt()) {
            yearOfBirth = scanner.nextInt();
            // This will prevent the exit after nextInt.
            scanner.nextLine();
        } else {
            System.out.println("Unable to parse year of birth.");
            System.exit(1);
        }

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        int age = Year.now().getValue() - yearOfBirth;

        System.out.println("Your name is " + name);
        System.out.println("Your age is " + age);

        scanner.close();
    }
}
