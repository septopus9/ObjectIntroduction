package com.leanr.object.functionalProgramming;

import java.util.List;

public class FunctionalProgrammingRunner {

    public static void main(String[] args) {
        List <String> list= List.of("Apple","Banana","Cat","Dog");

        List<Integer> list1 = List.of(1,2,3,4,5,6,7,8);
        System.out.println(printSumOfListFP(list1));






//        printWithFunctionalProgramming(list);
//        printBasicWithFiltering(list);
        printBasicWithFilteringFp(list);

    }

    private static int printSumOfListFP(List<Integer> list1) {
        int sum = list1.stream().filter(number -> number%2==1).reduce(0,(number01,number02) -> number01+number02);
        return sum;


    }

    private static void printBasic(List<String> list) {
        for (String s : list){
            System.out.println(s);
        }
    }


    private static void printWithFunctionalProgramming(List<String> list) {
        list.stream().forEach(element -> System.out.println(element));
    }

    private static void printBasicWithFiltering(List<String> list) {
        for (String s : list){
            if (s.endsWith("at"))
            System.out.println(s);
        }
    }

    private static void printBasicWithFilteringFp(List<String> list) {
        list.stream().filter(element -> element.endsWith("at")).forEach(element -> System.out.println(element));
    }








}
