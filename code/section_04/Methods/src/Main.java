public class Main {
    public static void main(String[] args) {
        int highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);

        calculateScore(false, 800, 8, 200);
        System.out.println("Your final score was " + highScore);

        // Challenge score.
        displayHighScorePosition("Peter", calculateHighScorePosition(1500));
        displayHighScorePosition("Jack", calculateHighScorePosition(900));
        displayHighScorePosition("Valentin", calculateHighScorePosition(400));
        displayHighScorePosition("Synthia", calculateHighScorePosition(50));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = -1;

        if (gameOver == true) {
            finalScore = score + (levelCompleted * bonus);
        }

        return finalScore;
    }

    public static void displayHighScorePosition (String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition (int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        } else {
            return 4;
        }
    }
}
