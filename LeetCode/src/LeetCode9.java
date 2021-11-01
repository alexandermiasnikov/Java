

public class LeetCode9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(5));
    }
    public static boolean isPalindrome(int x) {
        boolean res = false;
        if (String.valueOf(x).length() != 1) {
            for (int i = 0; i < String.valueOf(x).length() / 2; i++) {
                System.out.println(String.valueOf(x).charAt(i));
                res = String.valueOf(x).charAt(i) == String.valueOf(x).charAt(String.valueOf(x).length() - 1 - i);
                if (!res) {
                    break;
                }
            }
        } else{
            res = true;
        }
        return res;
    }
}
