import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // Define the number of subjects to make the code easy to change.
        final int NUMBER_OF_SUBJECTS = 5;

        // Use an array to store the marks for all subjects.
        double[] marks = new double[NUMBER_OF_SUBJECTS];
        double totalMarks = 0;
        double average;
        double percentage;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter marks for " + NUMBER_OF_SUBJECTS + " subjects.");

        // Loop to get marks for each subject and add them to the total.
        for (int i = 0; i < NUMBER_OF_SUBJECTS; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = input.nextDouble();
            totalMarks += marks[i];
        }
        average = totalMarks / NUMBER_OF_SUBJECTS;

        // Calculate the percentage, assuming each subject is out of 100.
        double maxTotalMarks = NUMBER_OF_SUBJECTS * 100.0;
        percentage = (totalMarks / maxTotalMarks) * 100;

        // Print the final results.
        System.out.println("\n--- Results ---");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + average);
        System.out.println("Percentage: " + percentage);

    }
}