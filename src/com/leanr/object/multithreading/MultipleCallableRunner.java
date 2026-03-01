package com.leanr.object.multithreading;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        List<CallableTask> callableTasks =List.of(new CallableTask("in28Minutes"),new CallableTask("Ranga"),new CallableTask("Adam"));
        List <Future<String>> results = executorService.invokeAll(callableTasks);


        for (Future<String> result : results){
            System.out.println(result.get());
        }

        executorService.shutdown();
    }
}
