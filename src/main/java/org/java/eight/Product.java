package org.java.eight;

public class Product {

    int i;
    String Name;

    public Product(int i, String potatoes) {
        this.i = i;
        this.Name = potatoes;
    }

    public Product() {
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
