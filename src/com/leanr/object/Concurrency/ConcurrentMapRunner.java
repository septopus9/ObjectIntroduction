package com.leanr.object.Concurrency;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapRunner {
    public static void main(String[] args) {
        String string = "ABCD ABCD ABCD";

        ConcurrentMap <Character ,LongAdder > occurances01 = new ConcurrentHashMap<>();

        for (char character :string.toCharArray() ){
            occurances01.computeIfAbsent(character, character1 -> new LongAdder()).increment();
        }
        System.out.println(occurances01);


        Map <Character, LongAdder> occurances = new HashMap<>();


        for (char character : string.toCharArray()){
            LongAdder longAdder = occurances.get(character);
            if (longAdder == null){
                longAdder = new LongAdder();

            }
            longAdder.increment();
            occurances.put(character,longAdder);



        }
//        System.out.println(occurances);

    }
}
