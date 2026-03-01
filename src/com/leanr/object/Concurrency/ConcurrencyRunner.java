package com.leanr.object.Concurrency;

public class ConcurrencyRunner {

    public static void main(String[] args) {

        BiCounter counter = new BiCounter();
        counter.incrementI();
        System.out.println(counter.getI());

    }
}
