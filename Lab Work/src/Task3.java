import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double principal = input.nextDouble();
        System.out.print("Enter rate of interest in percentage (%): ");
        double rate = input.nextDouble();
        System.out.print("Enter time in years: ");
        int time = input.nextInt();
        double si = calculateSimpleInterest(principal, rate, time);
        System.out.println("Simple Interest: " + si);

    }
    public static double calculateSimpleInterest(double principal, double rate, int time){
        rate = rate / 100;
        double si = principal * rate * time; // use this formula i = p*r*n
        return si;

    }
}
