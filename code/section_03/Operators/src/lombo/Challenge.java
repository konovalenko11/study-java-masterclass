package lombo;

public class Challenge {
    public static void main(String[] args){
        double d1 = 20.00;
        double d2 = 80.00;

        double result1 = (d1 + d2) * 100;
        System.out.println("d1 + d2: " + result1);

        double result2 = result1 % 40.00;
        System.out.println("Result 2 is: " + result2);

        boolean zeroRemainder = (result2 == 0) ? true : false;
        System.out.println("zeroRemainder: " + zeroRemainder);

        if (!zeroRemainder) {
            System.out.println("Got some remainder!");
        }
    }

}
