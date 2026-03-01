package com.leanr.object.step05;

public class Employee extends Person {

    private String tittle;
    private String employer;

    private String employerGrade;

    private int salary;


    public Employee(String name,String tittle) {
        super(name);
        this.tittle=tittle;
        System.out.println("employee constructor");
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getEmployerGrade() {
        return employerGrade;
    }

    public void setEmployerGrade(String employerGrade) {
        this.employerGrade = employerGrade;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return tittle+" "+employer+" "+employerGrade+" "+salary+" " + super.toString();
    }
}
