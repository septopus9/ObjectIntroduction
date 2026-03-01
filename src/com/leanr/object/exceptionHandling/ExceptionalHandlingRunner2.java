package com.leanr.object.exceptionHandling;

public class ExceptionalHandlingRunner2 {

    public static void main(String[] args) {


        method01();
        System.out.println("Main Ended");
    }

    private static void method01() {
        method02();
        System.out.println("Method01 Ended");
    }

    private static void method02() {

       try {


            int [] arr = {1,2};
            int number = arr[3];

            System.out.println("Method02 Ended");
        }
        catch (NullPointerException ex){
            System.out.println("Matched Null pointer exception");

        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Matched exception");

            ex.printStackTrace();
        }

    }

}
