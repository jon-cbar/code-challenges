import java.util.Scanner;

public class JavaStdinAndStdout1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amountInputs = 3;
        Integer value = 0;

        for (int i = 0; i < amountInputs; i++) {
            value = scanner.nextInt();
            System.out.println(value);
        }

        scanner.close();
    }
}
