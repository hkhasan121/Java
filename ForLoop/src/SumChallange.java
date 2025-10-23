public class SumChallange {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        System.out.print("List of numbers that divided by 3 and 5: ");
        for (int i = 1; i<1000; i++){
            if((i % 3 == 0) && (i % 5 == 0)){
                System.out.print(i + " ");
                sum = sum + i;
                count++;
                if(count == 5){
                    break; // found 5 numbers that divided by both 3 and 5 ,,then break
                }
            }
        }
        System.out.println();
        System.out.println("Total sum of numbers that divided by 3 and 5: " + sum);
    }
}
