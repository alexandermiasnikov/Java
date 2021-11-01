import org.w3c.dom.ls.LSOutput;

public class LeetCode1 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3, 2, 5, 6};
        int target = 7;
        for (int i : twoSum(nums, target)) {
            System.out.print(i + " ");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        int res;
        int calc = 1;
        for (int i = 0; i < nums.length - 1; i++){
            for (int j = nums.length - 1; j >= calc; j--){
                res = nums[i] + nums[j];
                if(res == target){
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }
            }
            calc++;
        }
        return arr;
    }
}
