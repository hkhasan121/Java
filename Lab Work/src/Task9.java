import java.util.Scanner;

public class Task9{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms (n) for the Fibonacci series: ");
        int n = scanner.nextInt();

        // --- Input Validation ---
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            scanner.close();
            return;
        }

        System.out.println("Fibonacci Series up to " + n + " terms:");

        // Initialize the first two terms
        int firstTerm = 0;
        int secondTerm = 1;

        // Special case for n=1
        if (n == 1) {
            System.out.print(firstTerm);
        } else {
            // Print the first two fixed terms
            System.out.print(firstTerm + ", " + secondTerm);

            // Start the loop from the 3rd term (i=3)
            for (int i = 3; i <= n; i++) {
                // Calculate the next term
                int nextTerm = firstTerm + secondTerm;

                // Print the next term
                System.out.print(", " + nextTerm);

                // Update the variables for the next iteration
                // The new 'firstTerm' becomes the old 'secondTerm'
                firstTerm = secondTerm;
                // The new 'secondTerm' becomes the calculated 'nextTerm'
                secondTerm = nextTerm;
            }
        }

        System.out.println(); 
        scanner.close();
    }
}