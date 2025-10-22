public class Methods {
    public static void main(String[] args) {



        int highScore = finalScore(true,100,8,100);
        System.out.println("Final Score: " + highScore);

        highScore = finalScore(true,100,10,100);
        System.out.println("Final Score: " + highScore);

        //without storing in a variable,we can direct print by method call.
        System.out.println("Next high score is : " +
                finalScore(true,10000,8,100));


        //practice challenges

        int position = calcuateHighscoreposition(1500);
        displayHighscorePosition("Hasan",position);
        position = calcuateHighscoreposition(1000);
        displayHighscorePosition("Sikder",position);
        position = calcuateHighscoreposition(500);
        displayHighscorePosition("Keya",position);
        position = calcuateHighscoreposition(100);
        displayHighscorePosition("Nirob",position);
        position = calcuateHighscoreposition(25);
        displayHighscorePosition("Fatema",position);








    }
    public static int finalScore(boolean gameOver,int score,int levelComplete,int bonus){
        int finalScore = score;
        if (gameOver){
            finalScore += (levelComplete * bonus);
        }
        return finalScore;
    }
    public static void displayHighscorePosition(String playerName,int position){
        System.out.println(playerName + " managed to get into position " +
                position + " on the high score table");
    }
    public static int calcuateHighscoreposition(int playerScore){
        if (playerScore >= 1000){
            return 1;
        }
        else if (playerScore >= 500 && playerScore < 1000){
            return 2;
        }
        else if (playerScore >= 100 && playerScore < 500){
            return 3;
        }
        else{
            return 4;
        }

    }
}
