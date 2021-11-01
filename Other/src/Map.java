import java.time.LocalDate;
import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowM1 = now.minusMonths(1);
        LocalDate nowM2 = now.minusMonths(2);
        LocalDate nowM3 = now.minusMonths(3);
        LocalDate nowM4 = now.minusMonths(4);

        int currM = now.getMonthValue();
        int currM1 = nowM1.getMonthValue();
        int currM2 = nowM2.getMonthValue();
        int currM3 = nowM3.getMonthValue();
        int currM4 = nowM4.getMonthValue();
        int dOm = now.getDayOfMonth();

        String currentM = null;
        String currentM1 = null;
        String currentM2 = null;
        String currentM3 = null;
        String currentM4 = null;

        HashMap<Integer, String> map = new HashMap<Integer, String>();

        if(dOm < 6){

            map.put(1, "Грудень");
            map.put(2, "Січень");
            map.put(3, "Лютий");
            map.put(4, "Березень");
            map.put(5, "Квітень");
            map.put(6, "Травень");
            map.put(7, "Червень");
            map.put(8, "Липень");
            map.put(9, "Серпень");
            map.put(10, "Вересень");
            map.put(11, "Жовтень");
            map.put(12, "Листопад");

        } else {

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

        }

        for (java.util.Map.Entry<Integer, String> entry : map.entrySet()){

            currentM = map.get(currM);
            currentM1 = map.get(currM1);
            currentM2 = map.get(currM2);
            currentM3 = map.get(currM3);
            currentM4 = map.get(currM4);
        }

        System.out.println(currentM);
        System.out.println(currentM1);
        System.out.println(currentM2);
        System.out.println(currentM3);
        System.out.println(currentM4);
    }
}
