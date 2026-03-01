package com.leanr.object.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileWriterRunner {
    public static void main(String[] args) throws IOException {

        Path fileToRead = Paths.get("./resources/file-write.txt");
        List <String> list = List.of("Apple","Boy","Cat","Dog","Elephant");

        Files.write(fileToRead,list);



    }
}
