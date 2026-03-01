package com.leanr.object.step04;

public class BookRunner {
    public static void main(String[] args) {
        Books book = new Books(1,"Animal Word Puzzle","Alex");
        book.addReview(new Review(101,"good",4));
        System.out.println(book);


    }
}
