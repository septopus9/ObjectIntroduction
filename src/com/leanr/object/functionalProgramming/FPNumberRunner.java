package com.leanr.object.functionalProgramming;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FPNumberRunner {
    public static void main(String[] args) {
        List <Integer> numbers = List.of(4,6,8,13,3,15);


//        getMaxNumber(numbers);
//        getMinNumber(numbers);


//        getOddNumbers(numbers);

//        getOddNumbersAsList(numbers);

        List <String> strings = List.of("Apple","Ant","Bat");


//        getEvenNumbersAsList(numbers);

        first10SqureNumber();


//        rangePrint();
//
//
//        getStrins(strings);
//
//        getLength(strings);


//        numbers.stream().forEach();


    }

    private static void first10SqureNumber() {
        System.out.println(IntStream.range(1,11).map(e -> e*e).boxed().collect(Collectors.toList()));
    }

    private static void getEvenNumbersAsList(List<Integer> numbers) {
        System.out.println(numbers.stream().filter(e-> e%2==0).collect(Collectors.toList()));
    }


    private static void getOddNumbersAsList(List<Integer> numbers) {
        System.out.println(numbers.stream().filter(e-> e%2==1).collect(Collectors.toList()));
    }

    private static void getOddNumbers(List<Integer> numbers) {
        numbers.stream().filter(e-> e%2==1).forEach(System.out::println);
    }

    private static void getMaxNumber(List<Integer> numbers) {
        System.out.println(numbers.stream().max((n1, n2) -> Integer.compare(n1,n2)).get());
    }
    private static void getMinNumber(List<Integer> numbers) {
        System.out.println(numbers.stream().min((n1, n2) -> Integer.compare(n1,n2)).get());
    }

    private static void rangePrint() {
        IntStream.range(1,11).forEach(p-> System.out.println(p*p));
    }

    private static void getLength(List<String> strings) {
        strings.stream().map(e-> e.length()).forEach(e-> System.out.println(e));
    }

    private static void getStrins(List<String> strings) {
        strings.stream().map(e -> e.toLowerCase()).forEach(e-> System.out.println(e));
    }
}
