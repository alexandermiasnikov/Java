import java.lang.*;

public class OldBeautifulNumbers {
    public static void main(String[] args) {
        System.out.println(beautifullNumber("1000005651651561.21"));
    }

    public static String beautifullNumber (String num){
        String sRes = "";
        int ind = num.lastIndexOf('.');
        String sNew = num.substring(0,ind);
        String[] arr = null;
        if (sNew.length()%3 == 0){
            arr = new String[sNew.length()/3];
        } else {
            arr = new String[sNew.length()/3 + 1];
        }
        for (int i = 0; i < arr.length; i ++) {
            try {
                arr[i] = sNew.substring(sNew.length() - 3);
                sNew = sNew.substring(0, sNew.length() - 3);
            } catch (StringIndexOutOfBoundsException e) {
                arr[i] = sNew;
            }
        }
        for (int i = arr.length - 1; i >= 0; i --) {
            if (i > 0) {
                sRes += arr[i] + " ";
            } else {
                sRes += arr[i];
            }
        }
        sRes += num.substring(num.lastIndexOf('.'));
        return sRes;
    }
}
