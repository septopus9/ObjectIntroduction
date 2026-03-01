package com.leanr.object.Concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class BiCounterWithLock02 {
    private AtomicInteger i =new AtomicInteger();
    private AtomicInteger j = new AtomicInteger();


    public int getI() {
        return i.get();
    }
     public void incrementI(){

      i.incrementAndGet();
    }

     public void incrementJ(){
       j.incrementAndGet();
    }

    public int getJ() {
        return j.get();
    }
}
