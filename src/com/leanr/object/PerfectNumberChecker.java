package com.leanr.object;

public class PerfectNumberChecker {


    public static boolean isPerfectNumber(int number) {
        if (number > 0)
       {
            int sum = 0;
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sum = sum + i;
                }

            }
            return sum == number;
       }
        else return false;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(0));

    }
}
