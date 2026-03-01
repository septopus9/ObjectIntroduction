package com.leanr.object;

import java.util.Scanner;

public class DoWhileRepeatedQuestion {




    public static void main(String[] args) {


            Scanner scanner = new Scanner(System.in);
            int number =0;
            do {
            System.out.println("Enter a number ");
            number=scanner.nextInt();

            System.out.println("Cube is "+number * number * number);
        }while (number >=0);
        System.out.println("Thank you have FUN !");


    }
}
