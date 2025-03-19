public class Challenge {

    public static void main(String[] args) {
        int num = 0;
        int sum = 0;

        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
                num++;
                sum += i;

                if (num == 5) {
                    break;
                }
            }
        }

        System.out.println("And the sum is: " + sum);
    }
}