import java.util.ArrayList;
import java.util.Collections;

public class HappyBirthday {
    public static void main(String[] args) {
        String [] wishes = {"крепкого здоровья", "любви", "везения", "удачи", "профессионального и карьерного роста"};
        ArrayList list = new ArrayList();
        for(int i = 0; i < wishes.length; i++){
            list.add(i);
        }
        Collections.shuffle(list);
        System.out.print("Коля!\nЖелаю тебе ");
        String wish = "";
        for(Object j : list){
            wish += wishes[(int) j] + ", ";
        }
        System.out.println(wish.substring(0, wish.length() - 2) + "!\nС днем рождения ;)");
    }
}
