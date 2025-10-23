public class CheckPrimeNumber {
    public static void main(String[] args) {
        System.out.println("0 is " + (isPrime(0) ? " " : "Not ") + "a Prime Number");
        System.out.println("1 is " + (isPrime(1) ? " " : "Not ") + "a Prime Number");
        System.out.println("2 is " + (isPrime(2) ? " " : "Not ") + "a Prime Number");
        System.out.println("3 is " + (isPrime(3) ? " " : "Not ") + "a Prime Number");
        System.out.println("8 is " + (isPrime(8) ? " " : "Not ") + "a Prime Number");
        System.out.println("19 is " + (isPrime(19) ? " " : "Not ") + "a Prime Number");
    }
    public static boolean isPrime(int wholeNumber){
        if(wholeNumber <= 2){
            if(wholeNumber == 2){
                return true;
            }
            else {
                return false;
            }
        }

        for(int divisor = 2; divisor < wholeNumber; divisor++){
            if(wholeNumber % divisor == 0){
                return false; //
            }
        }
        // If no divisors were found in the loop, the number is prime.
        return true;
    }
}
