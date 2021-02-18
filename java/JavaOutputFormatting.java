public class JavaOutputFormatting {
    public static void main(String[] args) {
        int amountInputs = 3;
        String key = "";
        Integer value = 0;
        String column1 = "";
        String column2 = "";
        String border = "================================";

        System.out.println(border);

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < amountInputs; i++) {
            key = scanner.next();
            value = scanner.nextInt();

            column1 = String.format("%-15s", key);
            column2 = String.format("%03d", value);

            System.out.println(column1 + column2);
        }
        scanner.close();

        System.out.println(border);
    }
}
