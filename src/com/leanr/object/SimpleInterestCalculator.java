package com.leanr.object;

import java.math.BigDecimal;

public class SimpleInterestCalculator {
    private BigDecimal principal;
    private BigDecimal rate;

    public static void main(String[] args) {
        SimpleInterestCalculator calculator = new SimpleInterestCalculator("4500","7.5");

        BigDecimal total =  calculator.calculateTotalValue(5);
        System.out.println(total);
    }

    private BigDecimal calculateTotalValue(int i) {
        BigDecimal numberOfYear= new BigDecimal(i);


        BigDecimal totalSum= principal.add(principal.multiply(rate).multiply(numberOfYear));
        return totalSum;
    }

    public SimpleInterestCalculator(String  principal, String  rate) {
        this.principal = new BigDecimal(principal);
        this.rate = new BigDecimal(rate).divide(new BigDecimal(100));

    }

}
