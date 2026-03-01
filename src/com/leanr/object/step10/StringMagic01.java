package com.leanr.object.step10;

public class StringMagic01 {

    public String reverseWordsInSentence(String sentence) {
        // TODO: Check if the sentence is null.
        // If the sentence is null, return "INVALID"

        if (sentence == null)
            return "INVALID";

        // TODO: Check if the sentence is empty.
        // If the sentence is empty, return an empty string
        if (sentence.equals(""))
            return "";

        // TODO: Split the sentence into words using the split method.
        // Use " " as the delimiter to match space.

        // TODO: Create a StringBuilder to hold the reversed sentence.
        StringBuilder reverseSentence= new StringBuilder();

        for (String word :sentence.split(" ")){

            StringBuilder reverseWord = new StringBuilder(word).reverse();
            reverseSentence.append(reverseWord).append(" ");

        }

        // TODO: Loop through each word in the words array.

        // TODO: For each word, create a StringBuilder and reverse the word.
        // Append the reversed word, followed by a space, to the reversed sentence.

        // TODO: After reversing all the words, trim the trailing space and return the reversed sentence.
        return reverseSentence.toString().trim();
    }

    public static void main(String[] args) {

    }



}
