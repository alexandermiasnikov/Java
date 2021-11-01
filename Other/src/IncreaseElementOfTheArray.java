import java.text.DecimalFormat;

public class IncreaseElementOfTheArray {
    public static void main(String[] args) {
        final String format = "#0.00";
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 100);
        }
        for (int i:
             array) {
            System.out.print(i + " ");
        }
        System.out.println();
        double res = IncEleOfTheArr(array[1]);
        System.out.println(new DecimalFormat(format).format(res));
    }

    public static double IncEleOfTheArr(int i){
        double res = i * 1.1;
        return res;
    }
}
