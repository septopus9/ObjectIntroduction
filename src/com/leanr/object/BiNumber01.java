package com.leanr.object;

public class BiNumber01 {

    private int number1;
    private int number2;

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public BiNumber01(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }
    public int calculateLCM() {
        // TODO: Write your code here
        if (number1 < 0 ||number2 <0){
            return -1;
        }
        if (number1==0 || number2==0){
            return 0;
        }
        int a = number1;
        int b = number2;



        while (b !=0){
            int temp = b;
            b=a%b;
            a=temp;

        }
        int gcd =a;

        return (number1*number2)/gcd;

        

    }

}
