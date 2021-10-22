public class ParsingStrings {
    public static void main(String[] args) {
        String numberAsString = "2018";
        int number = Integer.parseInt(numberAsString);

        System.out.println("number = " + number);

        numberAsString += 1;
        number += 1;

        System.out.println("NumberAsString = " + numberAsString);
        System.out.println("Number = " + number);
    }
}
