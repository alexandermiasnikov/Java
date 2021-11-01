
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LeetCode26 {
    public static void main(String[] args) {
        int[] nums = {1,1,2,12,15,16,17,};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++){
//            arrayList.add(nums[i]);
//        }
//        List<Integer> list = arrayList.stream().distinct().collect(Collectors.toList());
//        return list.size();

        int check = 1;
        if (nums.length != 0){
            for (int i = 0; i < nums.length - 1; i++){
                if (nums[i] != nums[i+1]){
                    check++;
                }
            }
        } else {
            check = 0;
        }
        return check;
    }
}
