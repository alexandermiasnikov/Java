import java.util.Arrays;
import javax.swing.*;

public class Array {
    public static void main(String[] args) {
        int array[] = new int[10];
        for(int i = 0; i <  array.length; i++) {
            array[i] =  (int)(Math.random() * 1000);
            System.out.print(array[i] + "  ");
        }
        Arrays.sort(array);
        System.out.println();
        for(int i = 0; i <  array.length; i++) {
            System.out.print(array[i] + "  ");
        }
    }
    public static void sort(int[] array){
        boolean res = false;
        int buf;
        while (!res){
            res = true;
            for (int i = 0; i < array.length-1; i++){
                if (array[i] > array[i+1]){
                    res = false;
                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;
                }
            }
        }
    }
}

