/*
    Write a method named printSquareStar with one parameter of type int named
    number.
    If number is < 5, the method should print "Invalid Value".
    The method should print diagonals to generate a rectangular pattern composed
    of stars (*). This should be accomplished by using loops
    (see examples below).

    EXAMPLE INPUT/OUTPUT:

    EXAMPLE 1
    printSquareStar(5); should print the following:

    → NOTE: For text in Code Blocks below, use code icon {...}  on Udemy

    *****
    ** **
    * * *
    ** **
    *****

    Explanation:

    *****   5 stars
    ** **   2 stars space 2 stars
    * * *   1 star space 1 star space 1 star
    ** **   2 stars space 2 stars
    *****   5 stars

    EXAMPLE 2

    printSquareStar(8); should print the following:

    ********
    **    **
    * *  * *
    *  **  *
    *  **  *
    * *  * *
    **    **
    ********


    The patterns above consist of a number of rows and columns (where number is
    the number of rows to print). For each row or column, stars are printed
    based on four conditions (Read them carefully):

    * In the first or last row
    * In the first or last column
    * When the row number equals the column number
    * When the column number equals rowCount - currentRow + 1 (where currentRow
    is current row number)


    HINT: Use a nested loop (a loop inside of a loop).
    HINT: To print on the same line, use the print method instead of println,
          e.g. System.out.print(" "); prints a space and does not "move" to
          another line.
    HINT: To "move" to another line, you can use an empty println call, e.g.
          System.out.println(); .
    NOTE: The method printSquareStar should be defined as public static like we
          have been doing so far in the course.
    NOTE: Do not add a main method to the solution code.
 */

public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(5);
        printSquareStar(8);
    }

    public static void printSquareStar (int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        int center = (number % 2 == 0) ? (number / 2) : (number / 2) + 1;
        int centerSize = (number % 2 == 0) ? 2 : 1;
        int centerDistanceX;
        int centerDistanceY;

        StringBuilder cellString = new StringBuilder();

        for (int y = 1; y <= number; y++) {
            // Clearing before population.
            cellString.setLength(0);

            // Distance to the center by Y.
            centerDistanceY = Math.abs(y - center) -
                    ((y <= center) ? 0 : (centerSize - 1));

            for (int x = 1; x <= number; x++) {
                // Distance to the center by X.
                centerDistanceX = Math.abs(x - center) -
                        ((x <= center) ? 0 : (centerSize - 1));

                // Printing borders.
                if (x == 1 || x == number || y == 1 || y == number){
                    cellString.append("*");
                } else if (centerDistanceX == centerDistanceY) {
                    // Printing diagonal if the offset from the center by X and
                    // Y is equal.
                    cellString.append("*");
                } else {
                    cellString.append(" ");
                }
            }

            System.out.println(cellString);
        }
    }
}
