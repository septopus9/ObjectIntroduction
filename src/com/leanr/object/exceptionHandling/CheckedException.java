package com.leanr.object.exceptionHandling;

public class CheckedException {

    public static void main(String[] args) {
      /*  try {
            sameOtherMethod();

        }
        catch (Exception ex){
            ex.printStackTrace();

        }

       */
//        sameOtherMethod();

    }

    private static void sameOtherMethod() throws InterruptedException {
        Thread.sleep(1000);
    }

    private static void sameOtherMethod2() throws RuntimeException {

    }
}
