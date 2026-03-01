package com.leanr.object.exceptionHandling;

public class ExceptionalHandlingRunner {

    public static void main(String[] args) {


        method01();
        System.out.println("Main Ended");
    }

    private static void method01() {
        method02();
        System.out.println("Method01 Ended");
    }

    private static void method02() {

        String s = null;
        try {
            System.out.println(s.length());
            System.out.println("Method02 Ended");
        }
        catch (Exception ex){
            ex.printStackTrace();
        }

    }

}
