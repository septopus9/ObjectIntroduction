package com.leanr.object.step10;

import java.util.HashMap;
import java.util.Map;

public class StringMagic {
    public static boolean areAnagrams(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        }
        // Write your code here
        if (str1.length() != str2.length()){
            return false;
        }
        else {


            char [] word01= str1.toLowerCase().toCharArray();
            char [] word02= str2.toLowerCase().toCharArray();
            Map <Character,Integer> wordList01 = new HashMap<>();
            Map <Character,Integer> wordList02 = new HashMap<>();


            for (char ch : word01){

                Integer i = wordList01.get(ch);

                if (i==null){
                    wordList01.put(ch,1);
                }else {
                    wordList01.put(ch,i+1);
                }
            }

            for (char ch : word02){

                Integer i = wordList02.get(ch);

                if (i==null){
                    wordList02.put(ch,1);
                }else {
                    wordList02.put(ch,i+1);
                }
            }

            if (wordList01.equals(wordList02))
            return true;




        }
        return false;

    }


    public static void main(String[] args) {

        System.out.println(areAnagrams("hello","olelh"));

    }
}
