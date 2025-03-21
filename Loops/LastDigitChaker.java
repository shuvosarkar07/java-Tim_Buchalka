public class LastDigitChaker {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));

        // Testing isValid method
        System.out.println(isValid(10));
        System.out.println(isValid(468));
        System.out.println(isValid(1051));
    }

    public static boolean hasSameLastDigit(int first, int second, int third) {
        if (!isValid(first) || !isValid(second) || !isValid(third)) {
            return false;
        }

        int lastDigitFirst = first % 10;
        int lastDigitSecond = second % 10;
        int lastDigitThird = third % 10;

        return lastDigitFirst == lastDigitSecond ||
                lastDigitFirst == lastDigitThird ||
                lastDigitSecond == lastDigitThird;
    }

    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }
}
