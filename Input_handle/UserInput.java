import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        // String name = System.console().readLine("Enter your name: ");
        // System.out.println("Hello, " + name);

        // String ageString = System.console().readLine("What year were you born? ");
        // int age = Integer.parseInt(ageString);
        // System.out.println("So you are " + (2025 - age) + " years old");

        // using Scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);

        System.out.print("What year were you born? ");
        int age = scanner.nextInt();
        System.out.println("So you are " + (2025 - age) + " years old");        

        scanner.close();
    }
}
