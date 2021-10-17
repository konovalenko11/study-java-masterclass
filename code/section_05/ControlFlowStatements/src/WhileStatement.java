public class WhileStatement {
    public static void main(String[] args) {
        // WHILE 1.
        int count = 1;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        // WHILE 2.
        count = 1;
        while (true) {
            if (count == 6) break;
            System.out.println("Count value is " + count);
            count++;
        }

        // DO WHILE will be executed at least once.
        count = 6;
        do {
            System.out.println("Count value is " + count);
            count++;
        } while (count < 6);

        // isEvenNumber.
        System.out.println("5 is even: " + isEvenNumber(5));
        System.out.println("10 is even: " + isEvenNumber(10));

        // WHILE 3
        int number = 1;
        int countEvenNumbers = 0;

        while (number <= 20) {
            if (isEvenNumber(number)) {
                System.out.println("Even number: " + number);
                countEvenNumbers++;
            }

            if (countEvenNumbers == 5) {
                break;
            }

            number++;
        }

        System.out.println("Count even numbers: " + countEvenNumbers);


    }

    public static boolean isEvenNumber(int number) {
        return (number % 2 == 0);
    }
}
