public class ForLoop {
    public static void main(String[] args) {
        double amount = 100;
        for (double rate = 7.5; rate<= 10; rate = rate + 0.25){
            double totalInterestRate = calculateInterest(amount, rate);
            if (totalInterestRate > 8.5){
                break;
            }
            System.out.println(rate + "% interest of "+ amount+ "$ is " + totalInterestRate);
        }

    }
    public static double calculateInterest(double amount, double interestRate){
        return amount * (interestRate/100);

    }
}
