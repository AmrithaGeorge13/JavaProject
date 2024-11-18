package org.designpattern.stratergyDesignPattern;

public class Main {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();
        paymentContext.setPaymentStrategy(new CreditCardPayment("123456789", "John Doe"));
        paymentContext.processPayment(100.00);
        // Pay with PayPal
        paymentContext.setPaymentStrategy(new PayPalPayment("johndoe@example.com"));
        paymentContext.processPayment(200.00);
    }
}















