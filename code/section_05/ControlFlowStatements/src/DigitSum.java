public class DigitSum {
    public static void main(String[] args) {
        sumDigits(125);
        sumDigits(10);
        sumDigits(1258);
        sumDigits(-1258);

    }

    public static int sumDigits(int number) {
        System.out.println("Input number: " + number);
        if (number < 10) {
            System.out.println("Total sum of digits: " + -1);
            return -1;
        }

        int sum = 0;
        int digit = 0;

        while (number > 0) {
            digit = number % 10;
            sum += digit;
            number /= 10;
        }

        System.out.println("Total sum of digits: " + sum);
        return sum;
    }
}
