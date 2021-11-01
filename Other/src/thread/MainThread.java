package thread;
import javax.swing.*;
import jdk.swing.interop.SwingInterOpUtils;

import java.time.LocalDate;
import java.time.LocalTime;

public class MainThread extends Thread{

    int part;

    public MainThread(int i){

        this.part = i;

    }

    @Override
    public void run(){

        try{

//        System.out.println(this.part + " " + LocalDate.now() + " " + LocalTime.now());
//
//        Thread.sleep(1000);

        System.out.println(5/0);

        } catch(Exception e){

            try{

                throw new Exception(e.toString());

            } catch(Exception ex){

                ex.printStackTrace();

            }
        }
    }
}
