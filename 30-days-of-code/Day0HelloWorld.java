import java.util.Scanner;

public class Day0HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        scanner.close();

        String message = "Hello, World.";
        System.out.println(message);
        
        String outputString = inputString;
        System.out.println(outputString);
    }
}