package com.leanr.object;

public class NumberUtils {

    public int getLastDigit(int number) {
        if (number < 0){
            return -1;
        }
        if (number == 0){

            return 0;
        }
        return number%10;
    }


    public int getNumberOfDigits(int number) {
        /**
         * This method calculates and returns the number of digits in a given integer.
         * If the number is negative, it returns -1.
         * If the number is zero, it returns 1 as zero is considered to have one digit.
         * @param number: an integer
         * @return number of digits in number, or -1 if number is negative, or 1 if number is zero.
         */
        // Write your code here

        if (number < 0)
        {
        return -1;
        }
        if (number ==0 ){
            return 1;

        }
        int numberOfDigit=0;
        while (number > 0){
           number= number/10;
           numberOfDigit++;

        }
        return numberOfDigit;
    }


    public int getSumOfDigits(int number) {
        // Write your code here

        if (number < 0)
        {
            return -1;
        }
        if (number ==0 ){
            return 1;

        }
        int sumOfDigits=0;
        while (number > 0){
            number= number%10;
            sumOfDigits+=number;
            number= 0;




        }
        return sumOfDigits;
    }

    public int reverseNumber(int number) {
        if (number < 0)
        {
            return -1;
        }
        if (number ==0 ){
            return 1;

        }
        int reverseNumber=0;

        while (number > 0){
            int lastDigit = number %10;
            reverseNumber = reverseNumber*10 +lastDigit;
            number = number/10;

        }
        return reverseNumber;


    }
    public static void main(String[] args) {

    }
}
