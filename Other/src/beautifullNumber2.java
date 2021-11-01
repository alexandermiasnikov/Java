import java.io.*;
import java.util.*;
import java.lang.*;

    public class beautifullNumber2 {
        public static void main(String[] args) {
            System.out.println(beautifullNumber("123456"));

        }

        public static String beautifullNumber(String num, boolean calcEsc){

            if (num != null){

                String res = "";
                String sNew;
                int ind = num.indexOf(".");

                if (ind == -1){

                    sNew = num;

                } else {

                    sNew = num.substring(0, ind);

                }

                String[] array;

                if (sNew.length() % 3 == 0){

                    array = new String[sNew.length() / 3];

                } else {

                    array = new String[sNew.length() / 3 + 1];

                }

                ArrayList list = new ArrayList();
                int countSecArg = 0;
                int countFirArg = sNew.length() - 3;

                for (int i = 0; i < array.length; i++){

                    try{

                        list.add(sNew.substring(countFirArg, sNew.length() - countSecArg));
                        countSecArg += 3;
                        countFirArg -= 3;

                    } catch (StringIndexOutOfBoundsException e){

                        if (sNew.length() % 3 == 1){

                            list.add(sNew.substring(0, 1));

                        }

                        if (num.length() % 3 == 2){

                            list.add(sNew.substring(0, 2));

                        }
                    }
                }

                for (int i = list.size()-1; i >= 0; i--){

                    if (i > 0){
                        if(calcEsc){
                            res += list.get(i) + "%20";
                        } else {
                            res += list.get(i) + " ";
                        }

                    } else {

                        res += list.get(i);

                    }
                }

                if (ind == -1){

                    return res;

                } else {

                    return res = res + "." + num.substring(ind + 1);

                }

            } else {

                return "---";

            }
        }

        public static String beautifullNumber(String num) {

            return beautifullNumber(num, false);

        }
    }


