public class Table {
    public static void main(String[] args) {
        int[] arrYear = {2017, 2018, 2019};

        int[] arrMonth = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        for(int y : arrYear){

            for(int m : arrMonth){

                if(y == 2019 && m >= 6) break;

                System.out.println(y + " " + m);

            }

        }
    }
}
