package com.leanr.object;

import java.util.ArrayList;
import java.util.List;

public class NumberMagic {

    public List<Integer> determineAllFactors(int number) {
        List <Integer> list=new ArrayList<>();

        // TODO: Write your code here
        if (number < 0) return list;
        for (int i =1 ; i <=number ;i++){
            if (number %i==0){
                list.add(i);
            }
        }
        return list;
    }

    public List<Integer> determineMultiples(int number, int limit) {

        // TODO: Write your code here
        List <Integer> list = new ArrayList<>();
        if (number <= 0 || limit <=0){
            return list;
        }
        for (int i = 1 ; number*i < limit ; i++){
            list.add(number*i);
        }
        return list;
    }

}
