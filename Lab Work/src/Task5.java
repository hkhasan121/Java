import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String checkInput = input.nextLine();
        // take only first character
        char check = checkInput.charAt(0);
        if((check >= 'a' && check <= 'z') || (check >='A' && check <= 'Z')){
            System.out.println(check + " is an alphabet.");
        } else if (check >= '0' && check <= '9') {
            System.out.println(check + " is a digit.");
        } else {
            System.out.println(check + " is a special character.");
        }

    }
}
