package abstractTest;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        B b = new B();

        b.testing("");
        System.out.println(b.num(1,2));
        b.run();

        System.out.println(LocalDate.now().getDayOfMonth());


    }
}
