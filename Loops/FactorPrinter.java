public class FactorPrinter {

    public static void main(String[] args) {
        printFactors(6);
        printFactors(32);
        printFactors(-2);
    }

    public static void printFactors(int number) {
        if ( number < 1) {
            System.out.println("Invalid value");
            return;
        }

        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}
