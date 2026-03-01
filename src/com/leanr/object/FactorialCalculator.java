package com.leanr.object;

public class FactorialCalculator {

    public static int calculateFactorial(int number) {
        if (number == 0){
            return 1;
        }
        if (number >0){
            int fac = 1;
            for (int i = 1 ; i <= number ; i++){
                fac= fac*i;

            }
            return fac;

        }

        return -1;
    }
    public static void main(String[] args) {
        System.out.println(calculateFactorial(4));


    }
}
