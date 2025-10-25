import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m; // start of the range
        int n; // end of the range
        System.out.print("Enter two range: ");
        m = input.nextInt();
        n = input.nextInt();

        //int count = 0;
        long sum = 0;
        System.out.println("Range: [" + m + " to " + n + "]");

        if (m < 0 || n < 0) {
            System.out.println("Please enter a valid range.");
        } else if (m <= n) {
            for (int i = m; i <= n; i++) {
                if (isPrime(i)) {
                    // count++;
                    sum += i;
                    System.out.print(i + " ");
                }
            }
            System.out.println("\nThe sum of all prime numbers in the range is: " + sum);
        } else {
            System.out.println("Invalid Range: Start of range (m) must be less than or equal to end of range (n).");
        }


    }

    public static boolean isPrime(int m) {
        if (m <= 2) {
            if (m == 2) {
                return true;
            } else {
                return false;
            }
        }
        for (int divisor = 2; divisor < m; divisor++) {
            if (m % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
