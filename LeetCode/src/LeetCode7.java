
public class LeetCode7 {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }
    public static int reverse(int x) {
        String s;
        String resS;
        if (x < 0){
            s = String.valueOf(x).substring(1);
        } else {
            s = String.valueOf(x);
        }
        int[] i = new int[s.length()];
        for (int j = 0; j < s.length(); j++){
            i[j] = Character.getNumericValue(s.charAt(j));
        }
        if (s.length() == 1){
            resS = s;
        } else{
            int[] res = new int[s.length()];
            int temp;
            int f = 0;
            for (int l = s.length() - 1; l > 0; l--){
                temp = i[f];
                res[f] = i[l];
                res[l] = temp;
                f++;
            }
            resS = String.valueOf(res[0]);
            for (int q = 1; q < s.length(); q++){
                resS += String.valueOf(res[q]);
            }
        }
        long resIntLong = Long.parseLong(resS);
        int resInt;
        if (resIntLong < Integer.MIN_VALUE || resIntLong > Integer.MAX_VALUE){
            resInt = 0;
        } else {
            resInt = Integer.parseInt(resS);
        }
        if (x < 0){
          resInt = resInt * -1;
        }
        return resInt;
    }
}
