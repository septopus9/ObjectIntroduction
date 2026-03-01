package com.leanr.object;

public class MyNumber {
    private int number;

    public MyNumber(int number) {
        this.number = number;
    }
    public boolean isPrime(){
        if (number <= 1)return false;
        if (number == 2) return false;
        if (number %2 ==0)return false;
        for (int i = 3 ; i *i <= number ; i+=2){
            if (number % i ==0 ){
                return false;
            }
        }
        return true;
    }


    public  void  printTriangle(){
        for (int i = 1 ; i <= number ; i++){
            for (int i1 = 1 ; i1 <= i ; i1++){
                System.out.print(i1+" ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        MyNumber myNumber = new MyNumber(9);
        System.out.println(myNumber.isPrime());
        myNumber.printTriangle();
         int sum = myNumber.sumUpToN();
        System.out.println(sum);

        int sumOfDivisors = myNumber.sumOfDivisors();
        System.out.println(sumOfDivisors);




    }

    private int sumOfDivisors() {
        int sumOfDivisors = 0 ;
        for ( int i = 2 ; i < number; i++){
            if (number %i==0){
            sumOfDivisors=sumOfDivisors+i;
            }
        }
        return sumOfDivisors;
    }

    private int sumUpToN() {
        int sum = 0 ;
        for ( int i = 1 ; i <= number; i++){
            sum=sum+i;
        }
        return sum;
    }
}
