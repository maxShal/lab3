package org.example;

public class Product {
    protected String name;
    protected String description;

    public Product() {
        this.name = "name";
        this.description = "description";
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Product(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Product(Product product)
    {
        Product product1 = new Product();
        product1.name = product.getName();
        product1.description = product.getDescription();
    }

    public String toString() {
        return String.format("Имя %s, Описание %s", name, description);
    }

    public int hashCode() {
        int result = name.hashCode();
        result += description.hashCode();
        return result;
    }

    public boolean qeuals(Product product) {
        if (product == null) {
            return false;
        } else {
            return hashCode() == product.hashCode();
        }

    }
}
