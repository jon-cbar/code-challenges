import java.util.Scanner;

public class JavaIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer value = scanner.nextInt();
        scanner.close();

        String message = "";

        if (value % 2 == 1) {
            // value is odd
            message = "Weird";
        } else if (value >= 2 && value <= 5) {
            // value is even and in the inclusive range of 2 to 5
            message = "Not Weird";
        } else if (value >= 6 && value <= 20) {
            // value is even and in the inclusive range of 6 to 20
            message = "Weird";
        } else {
            // value is even and greater than 20
            message = "Not Weird";
        }

        System.out.println(message);
    }
}
