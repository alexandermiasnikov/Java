import java.io.BufferedReader;
import java.io.FileReader;

public class Output {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("/home/user/Документы/task.txt"));
        System.out.println(reader.readLine());
    }
}
