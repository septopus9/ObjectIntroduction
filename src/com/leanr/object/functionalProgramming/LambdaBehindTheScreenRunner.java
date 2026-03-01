package com.leanr.object.functionalProgramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class  EvenNumberPredicate implements Predicate<Integer>{

    @Override
    public boolean test(Integer integer) {
        return integer%2==0;
    }
}

class SystemOutConsumer  implements Consumer<Integer>{

    @Override
    public void accept(Integer integer) {
        System.out.println(integer);
    }
}
class NumberSquareMapper implements Function<Integer,Integer>{

    @Override
    public Integer apply(Integer integer) {
        return integer *integer;
    }
}
public class LambdaBehindTheScreenRunner {

    public static void main(String[] args) {
//        List.of(23,43,34,45,36,48).stream().filter(n -> n%2==0).forEach(System.out::println);

//        List.of(23,43,34,45,36,48).stream().map(n -> n*n).filter(n -> n%2==0).forEach(System.out::println);

        List.of(23,43,34,45,36,48).stream().map(new NumberSquareMapper()).filter(new EvenNumberPredicate()).forEach(new SystemOutConsumer());



//        Stream<T> filter(Predicate<? super T> predicate);

//        void forEach(Consumer<? super T> action);


//        <R> Stream<R> map(Function<? super T, ? extends R> mapper);
//        R apply(T t);

    }
}
