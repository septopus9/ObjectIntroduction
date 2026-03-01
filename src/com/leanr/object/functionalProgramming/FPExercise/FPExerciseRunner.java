package com.leanr.object.functionalProgramming.FPExercise;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FPExerciseRunner {


    /**
     * This method generates the cubes of the first n natural numbers.
     * @param n The number of natural numbers for which cubes are to be calculated.
     * @return List<Integer> This returns a list of cubes of the first n natural numbers.
     */
    public static List<Integer> getCubesOfFirstNNumbers(int n) {
        // Write your code here
        return IntStream.range(1,n+1).boxed().map(number -> number*number*number).collect(Collectors.toList());
    }


    public static List<Integer> getCourseNameCharacterCount(List<String> courses) {
        // TODO: Write code
        if (courses==null){
            return List.of();
        }
        return courses.stream().map(String::length).collect(Collectors.toList());

    }

    public static long sumOfSquares(List<Integer> numbers) {

        // Check if the list is null.
        if (numbers==null)return 0;
        // Stream over the list of numbers, find squares and sum them up
        return numbers.stream().mapToLong(e -> e*e).sum();

    }

    public static int findMaxEvenNumber(List<Integer> numbers) {
        // Write your code here
        if (numbers==null)return 0;
        return numbers.stream().filter(e->e%2==0).max(Integer::compare).orElse(0);
    }



    public static List<Integer> filterOddNumbers(List<Integer> numbers) {

        // Write your code here
        return numbers.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());

    }

    public static void main(String[] args) {
        List <Integer> numbers = List.of(1,2,3,-3,5,8);




    }



}
