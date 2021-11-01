import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MsLdapDistribution {
    public static void main(String[] args) {

        Calendar calendar = new GregorianCalendar();
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
//        System.out.println(daysInMonth);
        int dynDayCalc = -1;
        if(daysInMonth == 31){
            dynDayCalc = 2;
        } else if(daysInMonth == 30 || daysInMonth == 29){
            dynDayCalc = 3;
        } else if(daysInMonth == 28){
            dynDayCalc = 4;
        }

        int [] daysCalc = {8, 13, 18, 23, 28, dynDayCalc};
        for (int dayCalc:
             daysCalc) {
            if(dayOfMonth == dayCalc){
                System.out.println("+");
            }
        }

// Розподілення відбувається різними хвилями (відповідно до дати)
// 1 хвиля: з 7 на 8 число;
// 2 хвиля: з 12 на 13 число;
// 3 хвиля: з 17 на 18 число;
// 4 хвиля: з 22 на 23 число;
// 5 хвиля: з 27 на 28 число;
// 6 хвиля: якщо 31 день в місяці то з 1 на 2 число;
// якщо 30 днів то з 2 на 3;
// якщо 29 днів то з 2 на 3;
// якщо 28 днів то з 3 на 4.




//        Calendar currMonth = Calendar.getInstance();
//        Calendar nextMonth = Calendar.getInstance();
//
//        currMonth.add(Calendar.MONTH, 0);
//        nextMonth.add(Calendar.MONTH, 1);







    }
}
