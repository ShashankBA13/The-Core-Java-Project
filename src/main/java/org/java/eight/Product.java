package org.java.eight;

public class Product {

    int id;
    String Name;

    public Product(int productId, String productName) {
        this.id = productId;
        this.Name = productName;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
