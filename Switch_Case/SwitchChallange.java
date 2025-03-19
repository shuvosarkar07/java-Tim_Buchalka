public class SwitchChallange {
    public static void main(String[] args) {
        System.out.println(getName('B'));
        System.out.println(getName('p'));
    }

    public static String getName(char ch) {
        return switch (ch) {
            case 'A' -> "A is Able";
            case 'B' -> "B is Baker";
            case 'C' -> "C is Charlie";
            case 'D' -> "D is Dog";
            case 'E' -> "E is Easy";
            default -> "Later not found!";
        };
    }
}
