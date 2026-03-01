package com.leanr.object.newfeature;

public class RecordRunner {
    record  Person(String name , String email , String phoneNumber){}

    public static void main(String[] args) {

        Person person = new Person("Sushanta","sushanta@gmail.com","123-456-789");
        System.out.println(person);

    }
}
