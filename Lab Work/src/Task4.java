import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();
        System.out.print("Enter third number: ");
        double num3 = input.nextDouble();
        double maxNumber = findLargeNumber(num1,num2,num3);
        System.out.println("The largest number is: " + maxNumber);
    }
    public static double findLargeNumber(double num1, double num2, double num3){
        double max = num1;
        if (num2 > max){
            max = num2;
        }
        if (num3 > max){
            max = num3;
        }
        return max;
    }
}
