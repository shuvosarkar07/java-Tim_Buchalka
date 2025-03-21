public class EvenDigitSum {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) return -1;
        int sum = 0;

        while (number > 0) {
            int targetDigit = number % 10;

            if (targetDigit % 2 == 0) {
                sum += targetDigit;
            }
            number /= 10;
        }

        return sum;
    }
}
