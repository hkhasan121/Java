public class SwitchCase {
    public static void main(String[] args) {
        String month = "january";
        String quarter = quarter(month);
        System.out.println(month + " is in " + quarter + " quarter.");

    }

    public static String quarter(String month) {
        return switch (month) {
            case "january", "february", "march","april" -> "1st";
            case "may", "june", "july","august" -> "2nd";
            case "september", "october", "november","december" -> "3rd";
            default -> "unknown";
        };
    }
}
