package org.designpattern.stratergyDesignPattern;

public class PayPalPayment implements PaymentStrategy{
    private String email;
    PayPalPayment(String email){
        this.email = email;
    }
    @Override
    public void pay(double amount) {
        System.out.println("Processing PayPal payment of $"+ amount);
    }
}
