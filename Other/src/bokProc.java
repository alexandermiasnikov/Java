public class bokProc {
    public static void main(String[] args) {

        String t = "... 5 % ...";
        String proc = "";

        int i = 32;

        String s1 = "процент";
        String s2 = "процента";
        String s3 = "процентов";


        if(i % 100 >= 10 && i % 100 <= 20){

            System.out.println(String.valueOf(i) + " " + s3);



        }

        else if(i % 10 == 1){

            System.out.println(String.valueOf(i) + " " + s1);

        }

        else if(i % 10 == 2 || i % 10 == 3 || i % 10 == 4){

            System.out.println(String.valueOf(i) + " " + s2);

        } else{

            System.out.println(String.valueOf(i) + " " + s3);

        }


    }
}
