package com.leanr.object;

public class LeapYearChecker {
    public static  boolean isLeapYear(int year) {
        if (year >0 ) {


            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    return year % 400 == 0;

                } else return true;


            }
            return false;
        }else return false;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(0));



    }
}
