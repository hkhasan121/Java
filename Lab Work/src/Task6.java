import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first length: ");
        double length1 = input.nextDouble();
        System.out.print("Enter second length: ");
        double length2 = input.nextDouble();
        System.out.print("Enter third length: ");
        double length3 = input.nextDouble();

        String typeOfTriangle = checkTriangle(length1, length2, length3);
        System.out.println(typeOfTriangle);
    }

    public static String checkTriangle(double length1, double length2, double length3) {
        if (length1 <= 0 || length2 <= 0 || length3 <= 0){
            return "Invalid,Length can not be negative or zero.";
        } else if ((length1 + length2) <= length3 || (length1 + length3) <= length2 || (length2 + length3) <= length1) {
            return "The given lengths DO NOT form a valid triangle.";
        }
        else if (length1 == length2 && length2 == length3) {
            return "The triangle is Equilateral because all three sides are equal.";
        } else if (length1 == length2 || length1 == length3 || length2 == length3) {
            return "The triangle is Isosceles because two sides are equal.";
        } else {
            return "The triangle is Scalene because all three sides are unequal.";
        }

    }
}
