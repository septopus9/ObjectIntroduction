package com.leanr.object;

import java.util.Arrays;

public class StringMagic {
    public static  String findLongestWord(String sentence) {

        String [] sen = sentence.split(" ");
        String longestWord = " ";

        for ( String word :sen){
            if (word.length() > longestWord.length()){
                longestWord = word;
            }
        }
        return longestWord;

    }
    public static void main(String[] args) {
        String s =  "I am sushanta ";

        System.out.println(findLongestWord(s));

        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        System.out.println(Arrays.equals(array1, array2));



    }
}
