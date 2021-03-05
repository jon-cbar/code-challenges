import java.util.Scanner;

public class Day5Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        scanner.close();

        int amountMultiples = 10;
        int multiple = 0;
        String messageFormat = "%d x %d = %d";
        String message = "";
        for (int i = 1; i <= amountMultiples; i++) {
            multiple = value * i;
            message = String.format(messageFormat, value, i, multiple);
            System.out.println(message);
        }
    }
}
