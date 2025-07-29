// File: Order.java
// package: ecommerce

package ecommerce;

import java.io.Serializable;
import java.util.List;

public class Order implements Serializable {
    private static final long serialVersionUID = 1L;

    private Customer customer;
    private List<Product> products;
    private double totalAmount;
    private boolean isCancelled = false;

    public Order(Customer customer, List<Product> products) {
        this.customer = customer;
        this.products = products;
        this.totalAmount = calculateTotal();
    }

    private double calculateTotal() {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }

    public void cancelOrder() {
        if (!isCancelled) {
            isCancelled = true;
            System.out.println("Order has been cancelled.");
        } else {
            System.out.println("Order is already cancelled.");
        }
    }

    public void placeOrder(Payment payment, Discountable discountable) {
        if (isCancelled) {
            System.out.println("Order is cancelled. Cannot proceed.");
            return;
        }

        customer.displayCustomer();
        products.forEach(Product::displayDetails);

        double discounted = discountable.applyDiscount(totalAmount);
        System.out.println("Total after discount: ₹" + discounted);

        payment.amount = discounted;
        payment.processPayment();
    }
}
