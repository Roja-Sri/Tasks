// File: CashOnDelivery.java
// package: ecommerce

package ecommerce;

public class CashOnDelivery extends Payment {
    public CashOnDelivery(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Cash on Delivery: ₹" + amount + " will be collected at the time of delivery.");
    }
}
