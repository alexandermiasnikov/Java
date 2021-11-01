import java.util.ArrayList;

public class VeryBeautifulNumbers {
    public static void main(String[] args) {

            System.out.println(parsNum("3990373"));

    }

    public static String parsNum(String s){
        if (s != null){

            String res = "";
            String sNew;
            int ind = s.indexOf(".");
            if (ind == -1){
                sNew = s;
            } else {
                sNew = s.substring(0, ind);
            }

            String[] array;

            if (sNew.length() % 3 == 0){
                array = new String[sNew.length() / 3];
            } else {
                array = new String[sNew.length() / 3 + 1];
            }

            ArrayList<String> list = new ArrayList<>();
            int countSecArg = 0;
            int countFirArg = sNew.length()-3;

            for (int i = 0; i < array.length; i++){
                try{
                    list.add(sNew.substring(countFirArg, sNew.length()-countSecArg));
                    countSecArg +=3;
                    countFirArg -=3;
                } catch (StringIndexOutOfBoundsException e){
                    if (sNew.length() % 3 == 1){
                        list.add(sNew.substring(0, 1));
                    }
                    if (s.length() % 3 == 2){
                        list.add(sNew.substring(0, 2));
                    }
                }
            }

            for (int i = list.size()-1; i >= 0; i--){
                if (i > 0){
                    res += list.get(i) + " ";
                } else {
                    res += list.get(i);
                }
            }

            if (ind == -1){
                return res;
            } else {
                return res = res + "." + s.substring(ind+1);
            }

        } else {
            return "---";
        }
    }
}
