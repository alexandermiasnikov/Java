import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseString {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();

        Reverse(s, s.length() - 1);
    }

    public static void Reverse(String s, int ind){
        if (ind == 0){
            System.out.println(s.charAt(ind));
            return;
        }
        System.out.print(s.charAt(ind));
        Reverse(s, ind - 1);
    }
}
