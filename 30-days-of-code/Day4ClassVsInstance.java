import java.util.Scanner;

public class Day4ClassVsInstance {
    private int age;

    public Day4ClassVsInstance(int initialAge) {
        // Add some more code to run some checks on initialAge
        if (initialAge >= 0) {
            this.age = initialAge;
        } else {
            System.out.println("Age is not valid, setting age to 0.");
            this.age = 0;
        }
    }

    public void amIOld() {
        // Write code determining if this person's age is old and print the correct
        // statement:
        String message = "";
        if (this.age < 13) {
            message = "You are young.";
        } else if (this.age >= 13 && this.age < 18) {
            message = "You are a teenager.";
        } else {
            message = "You are old.";
        }
        System.out.println(message);
    }

    public void yearPasses() {
        // Increment this person's age.
        this.age = this.age + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialAge = scanner.nextInt();
        scanner.close();
        Day4ClassVsInstance person = new Day4ClassVsInstance(initialAge);
        person.yearPasses();
        person.yearPasses();
        person.yearPasses();
        person.amIOld();
    }
}