package com.leanr.object;

public class WhileNumberPlayer {

    private  int limit;

    public void setLimit(int limit) {
        this.limit = limit;
    }



    public WhileNumberPlayer(int number) {
        this.limit = number;
    }


    public static void main(String[] args) {
        WhileNumberPlayer player = new WhileNumberPlayer(30);

//        player.printSquaresUptoLimit();
        System.out.println();

        player.printCubesUptoLimit();

    }

    private void printCubesUptoLimit() {
        int i = 1;

        while (i*i < limit){
            System.out.print(i*i+" ");
            i++;
        }


    }

    private void printSquaresUptoLimit() {
        int i = 1;

        while (i*i*i < limit){
            System.out.print(i*i*i+" ");
            i++;
        }

    }

}
