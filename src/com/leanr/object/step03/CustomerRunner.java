package com.leanr.object.step03;

public class CustomerRunner {
    public static void main(String[] args) {

        Address homeAddress = new Address("line 1","Kolkata","700127");
        Address workAddress = new Address("line 2","Kolkata","700127");

        Customer customer =new Customer("Sushanta",homeAddress);
        System.out.println(customer);
        customer.setWorkAddress(workAddress);

        System.out.println(customer);
    }
}
