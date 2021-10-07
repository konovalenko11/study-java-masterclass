public class Main {
    public static void main(String[] args) {
        calculateScore(true, 10000, 8, 200);
        calculateScore(false, 800, 8, 200);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = -1;

        if (gameOver == true) {
            finalScore = score + (levelCompleted * bonus);
        }

        System.out.println("Your final score was " + finalScore);

        return finalScore;
    }
}
