import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

public class LightningAndThunder {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter moment of lightning by any symbol");
        String lightning = reader.readLine();
        Date startOfLightning = new Date();

        System.out.println("Please enter moment of thunder by any symbol");
        String thunder = reader.readLine();
        Date startOfThunder = new Date();

        long mil = startOfThunder.getTime() - startOfLightning.getTime();
        double sec = mil / 1000;
        double res = new BigDecimal(sec / 3).setScale(2, RoundingMode.UP).doubleValue();
        System.out.println("Distance between lightning and thunder: " + res + " km.");
    }
}
