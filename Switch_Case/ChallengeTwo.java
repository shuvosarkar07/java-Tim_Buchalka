public class ChallengeTwo {
    public static void main(String[] args) {
        System.out.println(getDayOfWeek("Monday"));
        System.out.println(getDayOfWeek("sunday"));
        System.out.println(getDayOfWeek("Twesday"));
    }

    public static String getDayOfWeek(String day) {
        return switch (day.toLowerCase()) {  // Convert input to lowercase
            case "monday" -> "Today is Monday";
            case "tuesday" -> "Today is Tuesday";
            case "wednesday" -> "Today is Wednesday";
            case "thursday" -> "Today is Thursday";
            case "friday" -> "Today is Friday";
            case "saturday" -> "Today is Saturday";
            case "sunday" -> "Today is Sunday";
            default -> "Invalid day";
        };
    }
}
