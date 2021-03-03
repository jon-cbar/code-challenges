import java.util.Scanner;

public class Day3IntroToConditionalStatements {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.close();

        String message = "";

        if (N % 2 == 1) {
            // value is odd
            message = "Weird";
        } else if (N >= 2 && N <= 5) {
            // value is even and in the inclusive range of 2 to 5
            message = "Not Weird";
        } else if (N >= 6 && N <= 20) {
            // value is even and in the inclusive range of 6 to 20
            message = "Weird";
        } else {
            // value is even and greater than 20
            message = "Not Weird";
        }
        System.out.println(message);
    }
}
