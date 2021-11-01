

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class FunnyGame {

    final static String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) throws IOException, InterruptedException {
        int countPoint = 0;
        int countAttempt = 0;

        ArrayList<Character> listOfRandomFiveLetter = randomFiveLetter(ALPHABET);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String helloString = "Welcome to the funny game!".toUpperCase();

        for (int i = 0; i < helloString.length(); i++){
            System.out.print(helloString.charAt(i));
        }

        Thread.sleep(2000);
        System.out.println();
        System.out.println();
        System.out.println("Rules:");
        System.out.println("Computer have random 5 letter from alphabet.");
        System.out.println("You need to guess this letter. You have 10 attempt.");
        Thread.sleep(2000);
        System.out.println();
        System.out.println("Enter your predictions:");

        ArrayList<Character> checkList = new ArrayList<>();

        Character c = Character.toUpperCase(reader.readLine().charAt(0));
        checkList.add(c);

        if (GuessTheLetter(c, listOfRandomFiveLetter)) {
            System.out.println("Eee! :) Right!");
            countPoint++;
        }  else {
            System.out.println("Mmm :( Wrong!");
        }

        countAttempt++;

        while (true){
            if (countAttempt < 10) {
                if (countPoint < 5) {
                    c = Character.toUpperCase(reader.readLine().charAt(0));
                    if (CheckInput(c, checkList)) {
                        if (GuessTheLetter(c, listOfRandomFiveLetter)) {
                            System.out.println("Eee! :) Right!");
                            countPoint++;
                        } else {
                            System.out.println("Mmm... :( Wrong!");
                        }
                        checkList.add(c);
                        countAttempt++;
                    } else {
                        System.out.println("Attention! You're already enter this letter!");
                    }
                } else {
                    System.out.println();
                    System.out.print("Check the answers");
                    for (int i = 0; i < 5; i++){
                        System.out.print(".");
                        Thread.sleep(1000);
                    }

                    System.out.println();
                    System.out.println();

                    System.out.println("Congratulations, my friend!!! You're win!!!");
                    break;
                }
            } else {
                System.out.println();
                System.out.print("Check the answers");
                for (int i = 0; i < 5; i++){
                    System.out.print(".");
                    Thread.sleep(1000);
                }
                System.out.println();
                System.out.println();
                if (countPoint >= 0 & countPoint < 2){
                    System.out.println("You have " + countPoint + " right answers! So easy... :(");
                }
                else if (countPoint >= 2 & countPoint < 4){
                        System.out.println("You have " + countPoint + " right answers! Not bad! ;)");
                }
                else if (countPoint == 4){
                    System.out.println("You have " + countPoint + " right answers! Very good! :)");
                }
                System.out.println("Try again!");
                System.out.println();
                System.out.print("Right answer: ");

                for (Character t:
                        listOfRandomFiveLetter) {
                    System.out.print(t + " ");
                }
                break;
            }
        }
    }

    public static boolean CheckInput(Character c, ArrayList<Character> list){
            boolean res = true;

            for (int i = 0; i < list.size(); i++){
                if (c.equals(list.get(i))){
                    res = false;
                    break;
                }
            }
            return res;
        }

    public static ArrayList<Character> randomFiveLetter(String s){
        ArrayList<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < ALPHABET.length(); i++){
            integerList.add(i);
        }

        Collections.shuffle(integerList);

        ArrayList<Character> list = new ArrayList<>();

        int [] array = new int[5];
        for (int i = 0; i < array.length; i++){
            array[i] = integerList.get(i);
        }

        for (int i = 0; i < 5; i++){
            list.add(s.charAt(array[i]));
        }
        return list;
    }

    public static boolean GuessTheLetter(Character c, ArrayList<Character> a){
        boolean res = false;

        for (int i = 0; i < 5; i++){
                if (c.equals(a.get(i))){
                    res = true;
                }
        }
        return res;
    }
}
