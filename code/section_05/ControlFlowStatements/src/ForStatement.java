public class ForStatement {
    public static void main(String[] args) {
        int amount = 10_000;

        for(int i = 2; i < 9; i++) {
            System.out.printf("%,d at %s%% interest = %.2f\n", amount, i,
                    calculateInterest(10000, i));
        }

        for(int i = 8; i > 1; i--) {
            System.out.printf("%,d at %s%% interest = %.2f\n", amount, i,
                    calculateInterest(10000, i));
        }

        int primeCounter = 0;
        for (int i = 50; i < 100; i++) {
            if (isPrime(i)) {
                primeCounter++;
                System.out.printf("[%s] is prime\n", i);
            } else {
                System.out.printf("[%s] is NOT prime\n", i);
            };

            if (primeCounter == 3) break;
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
