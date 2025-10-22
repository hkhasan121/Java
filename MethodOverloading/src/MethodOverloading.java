public class MethodOverloading {
    public static void main(String[] args) {
         int newScore = calculateScore("Hasan",500);
         System.out.println("New score is: " + newScore);
         calculateScore(10);
    }
    public static int calculateScore(String playerName,int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }
    //method overloading
    public static int calculateScore(int score){
        System.out.println("Unknown player scored " + score + " points");
        return score * 1000;
    }
}
