

import java.util.Arrays;


public class LeetCode771 {
    public static void main(String[] args) {
        System.out.println(numJewelsInStones("z", "ZZ"));
    }

    public static int numJewelsInStones(String J, String S) {
        int res = 0;
        for (int i = 0; i < J.length(); i++){
            for (int j = 0; j < S.length(); j++){
                if (String.valueOf(J.charAt(i)).equals(String.valueOf(S.charAt(j)))){
                  res++;
                }
            }
        }
        return res;
    }
}
