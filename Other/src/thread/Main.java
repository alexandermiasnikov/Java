package thread;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) throws InterruptedException{

        try {

            MainThread[] t = new MainThread[4];

            for (int i = 1; i <= 3; i++) {

                t[i] = new MainThread(i);
                t[i].start();

            }

            for (int i = 1; i <= 3; i++) {

                t[i].join();

            }

            System.out.println();
            System.out.println(LocalDate.now() + " " + LocalTime.now());
        } catch (Exception e){

            e.printStackTrace();

        }
    }
}
