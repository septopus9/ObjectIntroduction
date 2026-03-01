package com.leanr.object.multithreading;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleAnyCallableRunner {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        List<CallableTask> callableTasks =List.of(new CallableTask("in28Minutes"),new CallableTask("Ranga"),new CallableTask("Adam"));
       String results = executorService.invokeAny(callableTasks);


        System.out.println(results);

        executorService.shutdown();
    }
}
