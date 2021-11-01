import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Replace {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String sNew = s.replaceAll("fuck", "f***");
        System.out.println(sNew);
    }
}
