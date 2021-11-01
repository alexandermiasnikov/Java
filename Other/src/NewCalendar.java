import java.time.LocalDate;
import java.time.LocalTime;

public class NewCalendar {
    public static void main(String[] args) {


        //         LocalDate now = LocalDate.now();
        LocalDate now = LocalDate.of(2020,1,1);
        LocalDate prev = now.minusDays(1);
        LocalTime time = LocalTime.now();
        int timeI = time.getHour();
        System.out.println(timeI);


        int today = now.getDayOfMonth();
        int month;
        int year;

        if (today == 1){

            month = prev.getMonth().getValue();
            year = prev.getYear();

        } else{

            month = now.getMonth().getValue();
            year = now.getYear();

        }

        System.out.println(year + " " + month);


    }
}
