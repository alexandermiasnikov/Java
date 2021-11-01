import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class WeightOnTheMoon {
    public static void main(String[] args) throws IOException {
        final String format = "#0.00";
        System.out.println("The program calculates your weight on the moon.".toUpperCase());
        System.out.println();
        System.out.println("Please indicate your weight in kilos: ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int output  = Integer.parseInt(reader.readLine());


        double res = output * 16.6 / 100;
        String formattedDouble = new DecimalFormat(format).format(res);

        System.out.println("Your weight on the moon: " + formattedDouble + " kilos");
    }
}
