package com.leanr.object.exceptionHandling;

class CurrenciesDoNotMatchException extends RuntimeException{
    public CurrenciesDoNotMatchException(String msg){
        super(msg) ;
    }

}

class Amount {
    private String currency;
    private int amount;

    public void add(Amount that){

            if (!this.currency.equals(that.currency)){
//                throw new Exception("Currencies don't match "+ this.currency+" "+ that.currency);
                throw   new CurrenciesDoNotMatchException("Currencies don't match "+ this.currency+" "+ that.currency);
            }
            this.amount = this.amount + that.amount;


    }

    public Amount(String currency, int amount) {
        this.currency = currency;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return amount+" "+ currency;

    }


}
public class ThrowingExceptionRunner {

    public static void main(String[] args) throws RuntimeException {
        Amount amount1 = new Amount("USD",10);
        Amount amount2 = new Amount("EUR",20);

        amount1.add(amount2);
        System.out.println(amount1);

    }


}
