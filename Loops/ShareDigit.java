public class ShareDigit {

    public static void main(String[] args) {

        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int first, int second) {
        if ((first < 10 || first > 99) || (second < 10 || second > 99)) {
            return false;
        }

        int firstDigit1 = first / 10;
        int firstDigit2 = first % 10;

        int secondDigit1 = second / 10;
        int secondDigit2 = second % 10;

        return (firstDigit1 == secondDigit1 ||
                firstDigit1 == secondDigit2 ||
                firstDigit2 == secondDigit1 ||
                firstDigit2 == secondDigit2);
    }
}
