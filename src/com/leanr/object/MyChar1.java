package com.leanr.object;

public class MyChar1 {
    // Method to determine if a character is a vowel
    public boolean isVowel(char ch) {

        // Use a switch statement to check for each vowel, both lowercase and uppercase
        switch (ch) {

            // TODO: Complete the switch statement
            case 'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u' ->{
                return true;
            }

        }

        return false;
    }
}
