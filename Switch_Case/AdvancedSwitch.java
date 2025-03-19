public class AdvancedSwitch {
    public static void main(String[] args) {
        System.out.println(getQuarter("march"));
        System.out.println(getQuarter("marchhhhhh"));
    }

    public static String getQuarter(String month) {
        return switch (month.toLowerCase()) {
            case "january", "february", "march" -> "Q1";
            case "april", "may", "june" -> "Q2";
            case "july", "august", "september" -> "Q3";
            case "october", "november", "december" -> "Q4";
//            default -> "Invalid month";
            default -> {
                String message = "invalid month";
                yield message + " " + month;
            }
        };
    }
}
