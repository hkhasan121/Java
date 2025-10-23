public class EnhancedChallange {
    public static void main(String[] args) {
        int day = 5;
        String dayOfTheWeek = printDayOfWeek(day);
        System.out.println("Day " + day + " is " + dayOfTheWeek);

    }
    public static String printDayOfWeek(int day){
       return switch (day){
            case 0 -> "Sun day";
            case 1 -> "Mon day";
            case 2 -> "Tues day";
            case 3 -> "Wedness day";
            case 4 -> "Thus day";
            case 5 -> "Fri day";
            case 6 -> "Sature day";
            default -> "Invalid day";
        };
    }
}
