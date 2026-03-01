package com.leanr.object.Concurrency;

public class Counter {
    private int i =0;


    public int getI() {
        return i;
    }
    synchronized public void incrementI(){
        i++;
    }



}
