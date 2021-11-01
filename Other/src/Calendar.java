import java.time.LocalDate;
import java.util.GregorianCalendar;

public class Calendar {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        LocalDate test = LocalDate.of(2020,1,1);
        LocalDate prev = now.minusDays(1);

        int month = prev.getMonth().getValue();
        int year = prev.getYear();

        System.out.println(year + " " + month);



    }
}
