import java.time.LocalDate;
import java.time.LocalTime;
import java.util.GregorianCalendar;

public class Time {
    public static void main(String[] args) {

        LocalDate nowDate = LocalDate.now();
        LocalDate prev = nowDate.minusDays(1);
        LocalTime nowTime = LocalTime.now();

        int month = prev.getMonth().getValue();
        int year = prev.getYear();
        int time = nowTime.getHour() * 100 + nowTime.getMinute();

        String prevDay = prev.toString();
        String repDate = "2020-01-22";
        if (prevDay.equals(repDate)){
            System.out.println("oook");
        }

    }
}

