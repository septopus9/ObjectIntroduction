package com.leanr.object;

public class BiNumber {

    private int number1;
    private int number2;


    public BiNumber(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }
    private int add() {
        return number1+number2;
    }

    private int multiply() {
        return number1*number2;
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public static void main(String[] args) {
        BiNumber number = new BiNumber(2,3);
        System.out.println(number.add());
        System.out.println(number.multiply());

        number.doubleValue();
        System.out.println(number.getNumber1());
        System.out.println(number.getNumber2());
    }

    private void doubleValue() {
        this.number1=number1*2;
        this.number2=number2*2;
    }


}
