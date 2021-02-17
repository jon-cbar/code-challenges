import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaStdinAndStdout2 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer i = Integer.parseInt(reader.readLine());
        Double d = Double.parseDouble(reader.readLine());
        String s = reader.readLine();
        reader.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
