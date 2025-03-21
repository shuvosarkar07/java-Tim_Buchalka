public class FindPalindromic {

    public static void main(String[] args) {
        System.out.println(isPalindromic(-1221));
        System.out.println(isPalindromic(707));
        System.out.println(isPalindromic(12443));
    }

    public static boolean isPalindromic(int number) {
        int originalNumber = number;

        if (number < 0) {
            number = Math.abs(number);
        }

        int reverseNumber = 0;
        while (number > 0) {
            reverseNumber = reverseNumber * 10 + number % 10;
            number /= 10;
        }

        return reverseNumber == (originalNumber < 0 ? Math.abs(originalNumber) : originalNumber);
    }
}
