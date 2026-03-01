package com.leanr.object.Collection;

import java.util.Comparator;

class AscendingStudentComparator implements Comparator<Student> {


    @Override
    public int compare(Student student01, Student student02) {

        return Integer.compare(student01.getId(),student02.getId());
    }
}
public class Student implements Comparable <Student> {
    private int id;
    private  String name ;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student Id : "+id +" Student Name: "+name;
    }

    @Override
    public int compareTo(Student that) {

        return Integer.compare(that.id,this.id);
    }
}
