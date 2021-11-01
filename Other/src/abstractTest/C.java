package abstractTest;

public interface C{

    default void run(){
        System.out.println("default");
    }

}
