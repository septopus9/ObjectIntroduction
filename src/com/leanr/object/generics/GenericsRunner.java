package com.leanr.object.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsRunner {
    static <X> X doubleValue(X value){
        return value;

    }

    static  <X extends List>  void  duplicate (X list){
        list.addAll(list);

    }


    static  double sumOfNumberList (List <? extends Number > numbers){
        double sum =0.0;

        for (Number number : numbers){
            sum += number.doubleValue();
        }
        return sum;
    }



    public static void main(String[] args) {


        System.out.println(sumOfNumberList(List.of(1,2,3,4,5,6)));
        System.out.println(sumOfNumberList(List.of(1.1,2.1,3.1,4.1,5.1,6.1)));
        System.out.println(sumOfNumberList(List.of(1L,2L,3L,4L,5L,6L)));

        String value1 = doubleValue(new String());
        Integer value02 = doubleValue(Integer.valueOf(6));
        ArrayList value3 = doubleValue(new ArrayList<>());

        ArrayList <Integer> numbers = new ArrayList<>(List.of(1,2,3));

        duplicate(numbers);
//        System.out.println(numbers);







        MyCustomList <String >list02 = new MyCustomList();
        list02.addElement("Element 01");
        list02.addElement("Element 02");
        list02.addElement("Element 03");
        String value = list02.get(0);
//        System.out.println(value);


//        System.out.println(list02);


        MyCustomList <Integer >list01 = new MyCustomList();
        list01.addElement(1);
        list01.addElement(2);
        list01.addElement(3);
        Integer value01 = list01.get(2);
//        System.out.println(value01);

//        System.out.println(list01);


    }
}
