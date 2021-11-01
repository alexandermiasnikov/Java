
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class LookingForPoint {
     public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            ArrayList<String> list = new ArrayList();
            while (true){
                String s = reader.readLine();
                if (s.equals(".")) break;
                list.add(s);
            }

            for (String res:
                    list) {
                System.out.println(res);
            }
        }
    }

