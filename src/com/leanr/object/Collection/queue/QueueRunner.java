package com.leanr.object.Collection.queue;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String value01, String value02) {
        return Integer.compare(value02.length(),value01.length());
    }
}
public class QueueRunner {
    public static void main(String[] args) {
        Queue <String> priorityQueue = new PriorityQueue<>(new StringLengthComparator() );

        priorityQueue.addAll(List.of("Zebra","Monkey","Cat","Apple"));
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());




    }
}
