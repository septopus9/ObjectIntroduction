package com.leanr.object.Concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithLock {
    private int i =0;
    private int j =0;
    Lock lockForI = new ReentrantLock();
    Lock lockForJ = new ReentrantLock();

    public int getI() {
        return i;
    }
     public void incrementI(){
        lockForI.lock();
        i++;
        lockForI.unlock();
    }

     public void incrementJ(){
        lockForJ.lock();
        j++;
        lockForI.unlock();
    }

    public int getJ() {
        return j;
    }
}
