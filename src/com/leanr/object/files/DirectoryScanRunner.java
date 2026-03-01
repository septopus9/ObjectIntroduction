package com.leanr.object.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class DirectoryScanRunner {

    public static void main(String[] args) throws IOException {

//        Path currentDirectory = Paths.get(".");
//        Files.list(currentDirectory).forEach(System.out::println);
//
//        Predicate<? super Path> predicate=path -> String.valueOf(path).contains(".java");
////        Files.walk(currentDirectory,8).filter(predicate).forEach(System.out::println);
//
//        //
//
//
//        BiPredicate<Path, BasicFileAttributes> javaMatcher=((path, attributes1) -> String.valueOf(path).contains(".java"));
//
//        BiPredicate<Path, BasicFileAttributes> directoryMatcher=((path, attributes1) ->
//                attributes1.isDirectory());
//
//
//
//        Files.find(currentDirectory,4,directoryMatcher).forEach(System.out::println);


        Path fileToRead = Paths.get("./resources/data.txt");

        List<String> lines = Files.readAllLines(fileToRead);
        System.out.println(lines);

        //2nd Approach
        Files.lines(fileToRead)
                .map(String::toLowerCase)
                .filter(str-> str.contains("b")).forEach(System.out::println);




    }
}
