public class WhileLoopChallenge {

    public static void main(String[] args) {
        int i = 5;
        int totalEven = 0;

        while (i <= 20) {
            if (isEvenNumber(i)) {
                System.out.println(i);
                totalEven++;

                if (totalEven == 5) {
                    break;
                }
            }
            i++;
        }
    }

    public static boolean isEvenNumber(int num) {
        return num % 2 == 0;
    }
}
