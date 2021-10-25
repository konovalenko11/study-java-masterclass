import java.time.Year;
import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");
        int yearOfBirth = scanner.nextInt();

        // This will prevent the exit after nextInt.
        scanner.nextLine();

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        int age = Year.now().getValue() - yearOfBirth;

        System.out.println("Your name is " + name);
        System.out.println("Your age is " + age);

        scanner.close();
    }
}
