import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the upper limit: ");

        if (input.hasNextInt()) { // this line check the input is integer or not
            int end = input.nextInt(); // take the input into end variable
            if (end < 1) {
                System.out.println("Please enter a positive number.");
            } else {
                System.out.println("Even numbers from 1 to " + end + " are:");
                for (int i = 1; i <= end; i++) {
                    if (i % 2 == 0) {
                        System.out.print(i + " ");
                    }
                }
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }


    }
}
