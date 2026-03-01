package com.leanr.object.functionalProgramming;

import java.util.List;
import java.util.stream.Stream;

public class MethodReferencesRunner {

    public static void print(Integer integer){
        System.out.println(integer);
    }

    public static boolean solve(Integer integer){
        return integer%2==0;


    }

    public static void main(String[] args) {
        List.of("Ant","Bat","Dog","Elephant").stream()
                .map(e -> e.length()).forEach(System.out::println);


        List.of("Ant","Bat","Dog","Elephant").stream()
                .map(String ::length).forEach(MethodReferencesRunner::print);



//      System.out.println(max);

        Integer max01 = Stream.of(23,45,67,12)
                .filter( MethodReferencesRunner::solve )
                .max(Integer::compare)
                .orElse(0);


        System.out.println(max01);



    }
}
