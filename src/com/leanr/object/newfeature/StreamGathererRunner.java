package com.leanr.object.newfeature;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamGathererRunner {

    public static void fold(){
       Stream<Integer> numbers = IntStream.rangeClosed(1,21).boxed();
       numbers.gather(Gatha)
    }
    public static void main(String[] args) {

    }
}
