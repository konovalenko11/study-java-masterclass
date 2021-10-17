public class Sum3and5 {
    public static void main(String[] args) {
        int matchedCount = 0;
        int matchedSum = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                matchedCount++;
                matchedSum += i;
                System.out.printf("Matched number[%s]: %s;\n", matchedCount, i);
            }

            if (matchedCount == 5) {
                System.out.println("Sum of matched numbers: " + matchedSum);
                break;
            }
        }
    }
}
