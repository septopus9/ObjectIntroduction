package com.leanr.object.multithreading;


class Task extends Thread{

    private int number ;

    public Task(int number) {
        this.number = number;
    }

    public void run(){
        System.out.println("Task "+number+" Started");

        for (int i=number; i<= number *100+99; i++)
            System.out.print(i+" ");

        System.out.println("Task "+number+" Ended");

    }
}

class Task2 implements  Runnable{

    @Override
    public void run() {
        System.out.println("Task 2 stated");
        for (int i=201; i<= 299; i++)
            System.out.print(i+" ");
        System.out.println("Task 2 Ended  ");

    }
}
public class ThreadBasicRunner {
    public static void main(String[] args) {
        //Task01
        System.out.println("Task 1 Kicked Off");
////        Task task01 = new Task();
//        task01.start();

        //Task02
//        System.out.println("Task 2 Kicked Off");
//        Task2 task2 =new Task2();
//        Thread task2Thread = new Thread(task2);
//        task2Thread.start();

//        //Task03
//        for (int i=301; i<= 399; i++)
//            System.out.print(i+" ");
    }
}
