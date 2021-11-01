

import java.util.*;
import static java.lang.Math.abs;

public class LeetCode1200 {
    public static void main(String[] args) {
        int[] arr = {4,2,1,3};
        System.out.println(minimumAbsDifference(arr));
    }

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        ArrayList<Integer> arrInput = new ArrayList<>();
        for (int j:
             arr) {
            arrInput.add(j);
        }
        Collections.sort(arrInput);
        int[] arrS = new int[arrInput.size()];
        for (int i = 0; i < arrInput.size(); i++){
            arrS[i] = arrInput.get(i);
        }
        ArrayList<Integer> diff = new ArrayList<Integer>();
        for (int i = 0; i < arrS.length - 1; i++){
            diff.add(abs(arrS[i] - arrS[i + 1]));
        }
        int minDiff = Collections.min(diff);
        ArrayList<Integer> indexList = new ArrayList<Integer>();
        for (int j = 0; j < diff.size(); j++) {
            if (minDiff == diff.get(j)) {
                indexList.add(j);
            }
        }
        List<List<Integer>> finalRes = new ArrayList<>();
        for (int i = 0; i < indexList.size(); i++) {
            ArrayList<Integer> listRes = new ArrayList<>(i);
            listRes.add(arrS[indexList.get(i)]);
            listRes.add(arrS[indexList.get(i) + 1]);
            finalRes.add(listRes);
        }
        return finalRes;
    }
}
