package com.leanr.object.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentRunner {

    public static void main(String[] args) {
        List <Student> studentList = List.of(new Student(1,"Sushanta"),
                new Student(3,"Aman"));

        ArrayList<Student> studentArrayList =new ArrayList<>(studentList);

//        System.out.println(studentList);
        Collections.sort(studentArrayList);
        System.out.println("Des cending "+studentArrayList);

//        Collections.sort(studentArrayList,new DescendingStudentComparator());
//        System.out.println(studentArrayList);
        studentArrayList.sort(new AscendingStudentComparator());
        System.out.println("Ascending "+studentArrayList);


    }
}
