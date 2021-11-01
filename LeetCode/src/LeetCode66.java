

import java.math.BigInteger;

public class LeetCode66 {
    public static void main(String[] args) {
        int[] digits = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
        for (int y : plusOne(digits)){
            System.out.print(y);
        }
    }
    public static int[] plusOne(int[] digits){
        BigInteger b1, b2, b3;
        String s = String.valueOf(digits[0]);
        for(int r = 1; r < digits.length; r++){
            s += String.valueOf(digits[r]);
        }
        b1 = new BigInteger(s);
        b2 = new BigInteger("1");
        b3 = b1.add(b2);
        int[] res = new int[String.valueOf(b3).length()];
        for (int j = 0; j < String.valueOf(b3).length(); j++){
            res[j] = Character.getNumericValue(String.valueOf(b3).charAt(j));
        }
        return res;
    }
}
