package com.leanr.object.Collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {
    public static void main(String[] args) {
        String s = "This is an aewsome occasion " + "This has never happend before";

        Map<Character,Integer> occurrence  = new HashMap<>();
        Map<String,Integer> wordOccurrence  = new HashMap<>();

        String [] words  = s.split(" ");


        char [] chars = s.toCharArray();

        for (char characters : chars){
            Integer integer = occurrence.get(characters);

            if (integer == null){
                occurrence.put(characters,1);

            }else {
                occurrence.put(characters,integer+1);
            }
        }
        System.out.println(occurrence);




        for (String string : words ){

            Integer i = wordOccurrence.get(string);

            if (i==null){
                wordOccurrence.put(string,1);
            }else {
                wordOccurrence.put(string,i+1);
            }


        }

        System.out.println(wordOccurrence);

        Map <String,Integer> map =Map.of("A",2,"B",3,"C",4);

        System.out.println(map.containsValue(4));
        System.out.println(map.keySet());




    }
}
