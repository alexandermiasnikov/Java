import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class ColumnMonth {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowM1 = now.minusMonths(1);
        LocalDate nowM2 = now.minusMonths(2);
        LocalDate nowM3 = now.minusMonths(3);
        LocalDate nowM4 = now.minusMonths(4);

        DayOfWeek dayOfWeek = now.getDayOfWeek();
        int dOw = dayOfWeek.getValue();

        int currM1 = nowM1.getMonthValue();
        int currM2 = nowM2.getMonthValue();
        int currM3 = nowM3.getMonthValue();
        int currM4 = nowM4.getMonthValue();

        String currentM = null;
        String currentM1;
        String currentM2;
        String currentM3;
        String currentM4;

        Map<Integer, String> map = new HashMap();
        map.put(1, "Січень");
        map.put(2, "Лютий");
        map.put(3, "Березень");
        map.put(4, "Квітень");
        map.put(5, "Травень");
        map.put(6, "Червень");
        map.put(7, "Липень");
        map.put(8, "Серпень");
        map.put(9, "Вересень");
        map.put(10, "Жовтень");
        map.put(11, "Листопад");
        map.put(12, "Грудень");

        for (Map.Entry entry : map.entrySet()) {

            currentM = map.get(currM1);

        }

        System.out.println(currentM);


    }
}
