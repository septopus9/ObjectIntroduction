package com.leanr.object.step08;

public class AnimalRunner {
    public static void main(String[] args) {
        Animal animal[] = {new  Dog(), new Cat()};

        for (Animal animal1 : animal){
            System.out.println(animal1 .bark());
        }
    }


    public int perform(int x, int y) {
        // Write your code here
        if (y < 0){
            return -1;
        } else{
            return x/y;
        }

    }
}
