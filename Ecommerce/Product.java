// File: Product.java
// package: ecommerce

package ecommerce;

import java.io.Serializable;

public abstract class Product implements Serializable {
    private static final long serialVersionUID = 1L;

    protected String id;
    protected String name;
    protected double price;
    protected int stockQty = 10; // Default stock

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public abstract void displayDetails();

    public double getPrice() {
        return price;
    }

    public int getStockQty() {
        return stockQty;
    }

    public void updateStock(int qty) {
        this.stockQty += qty;
    }

    public boolean reduceStock(int qty) {
        if (stockQty >= qty) {
            stockQty -= qty;
            return true;
        } else {
            return false;
        }
    }
}

