

//Given an integer number n, return the difference between the product of its digits and the sum of its digits.

public class LeetCode1281 {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(245));
    }

    public static int subtractProductAndSum(int n){
        int sum = 0;
        for (int i = 0; i < String.valueOf(n).length(); i++){

            sum += Character.getNumericValue(String.valueOf(n).charAt(i));

        }
        int [] bank = new int[String.valueOf(n).length()];
        for (int i = 0; i < String.valueOf(n).length(); i++){

            bank[i] = Character.getNumericValue(String.valueOf(n).charAt(i));

        }
        int pro = bank[0];
        for (int i = 1; i < bank.length; i++) {

            pro *= bank[i];

        }

        return pro - sum;

    }
}




