package com.leanr.object;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

    private String name ;
    private ArrayList<Integer> marks = new ArrayList<>();



    public Student(String name,int... marks) {
        this.name = name;
        for (int mark :marks){
            this.marks.add(mark);
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }






    public int getTotalSumOfMarks(){
        int sum=0;
        for (int mark :marks){
            sum+=mark;

        }
        return sum;


    }

    public int getMaximumMarks(){
        return Collections.max(marks);

    }
    public int getMinimumMarks(){
       return Collections.min(marks);

    }

    @Override
    public String toString() {
        return name + marks;
    }

    public static void main(String[] args) {
        int[] lisOfMarks = {97,98,100 };
        Student s1 = new Student("Aman",lisOfMarks);
        int number = s1.getNumberOfMarks();
        System.out.println(number);
        int sum = s1.getTotalSumOfMarks();
        System.out.println(sum);

        int max = s1.getMaximumMarks();
        System.out.println(max);

        int min = s1.getMinimumMarks();
        System.out.println(min);

        BigDecimal average  = s1.getAverageMarks();
        System.out.println(average);

        System.out.println(s1);

        s1.addNewMark(35);
        System.out.println(s1);
        s1.removeMark(2);
        System.out.println(s1);










    }

    private void removeMark(int index) {
        marks.remove(index);
    }

    private void addNewMark(int mark) {
        marks.add(mark);

    }


    public BigDecimal getAverageMarks() {
        int sum = getTotalSumOfMarks();
        int number = getNumberOfMarks();

        return new BigDecimal(sum)
                .divide(new BigDecimal(number), 2, RoundingMode.HALF_UP);
    }

    private int getNumberOfMarks() {
        return marks.size();
    }

}
