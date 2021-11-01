

public class LeetCode860{

    public static void main(String[] args){
        int[] bills = {5,5,10,10,20};
        System.out.println(lemonadeChange(bills));
    }
    public static boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        int check = 1;
        for (int i: bills){
            if (i == 5){
                five++;
            }
            if (i == 10){
                if (five >= 1){
                    five--;
                    ten++;
                } else{
                    check = 0;
                    break;
                }
            }
            if (i == 20){
                if (ten >= 1 & five >= 1){
                    ten--;
                    five--;
                }
                else if(ten == 0 & five >= 3){
                    five -= 3;
                } else{
                    check = 0;
                    break;
                }
            }
        }
        if(check == 1){
            return true;
        } else{
            return false;
        }
    }
}
