import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class TestNew implements TestInter{

    public static void main(String[] args) {


        System.out.println(LocalTime.now().getHour() * 100 + LocalTime.now().getMinute());


    }

    @Override
    public void ret() {
        System.out.println("");
    }
}

interface TestInter{
    void ret();
}








