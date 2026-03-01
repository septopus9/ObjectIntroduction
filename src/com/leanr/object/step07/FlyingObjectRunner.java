package com.leanr.object.step07;

public class FlyingObjectRunner {
    public static void main(String[] args) {
        Flyable flyingObject [] = {new Birds(),new Aeroplane()} ;

        for (Flyable f1 : flyingObject){
            f1.fly();
        }
    }
}
