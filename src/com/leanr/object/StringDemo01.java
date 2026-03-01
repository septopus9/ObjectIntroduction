package com.leanr.object;

public class StringDemo01 {
    public static void main(String[] args) {
        String string = "This is a lot of text again";

        for (int i = 0 ; i < string.length(); i++){
            System.out.println(string.charAt(i));
        }

//        Integer i = new Integer(6);
//        Integer

        Integer i1 = Integer.valueOf(5);
        Integer i2 = Integer.valueOf(5);
        System.out.println(i1==i2);




    }
}
