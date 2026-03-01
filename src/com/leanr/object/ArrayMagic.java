package com.leanr.object;

public class ArrayMagic {

    public boolean doesHaveElementGreaterThan(int[] array, int number) {

        // TODO: Write your code

        for (int num : array){
            if (num>  number){
                return true;

            }
        }

        return false;

    }


    public int findSecondLargestElement(int[] array) {
        //TODO: Write your code here
        if ( array.length < 2) {
            return -1;
        }


            int largestElement = Integer.MIN_VALUE;
            int secondLargestElement = Integer.MIN_VALUE;

            for (int value : array) {
                if (value > largestElement) {
                    secondLargestElement = largestElement;
                    largestElement = value;
                } else if (value > secondLargestElement && value != largestElement) {
                    secondLargestElement = value;
                }
            }


            if (secondLargestElement == Integer.MIN_VALUE){
                return -1;
            }
        return secondLargestElement;


    }

    public boolean isSorted(int[] array) {

        // TODO: Write code here
        for (int i = 0 ; i < array.length-1 ; i++){
            if (array[i] > array[i+1]){
                return false;
            }

        }
        return true;
    }


    public int[] reverseArray(int[] array) {

        // TODO: Write your code here
        int left =0;
        int right =array.length-1;

        while (left < right){
            int temp = array[left];
            array[left]=array[right];
            array[right]=temp;
            left++;
            right--;
        }
        return array;
    }




    public static void main(String[] args) {

    }
}
