/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Objects;

/**
 *
 * @author atako
 */
public class Product implements Comparable<Product>{
    private String id;
    private String name;
    private float unitPrice;
    private Integer quantity;
    private Integer quantitySell;
    private String category;
    
    @Override
    public int compareTo(Product t) {
        return this.name.compareTo(t.name);
    }    
    
    public Product() {
    }

    public Product(String id, String name, float unitPrice, int quantity,  int quantitySell, String category) {
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.quantitySell = quantitySell;
        this.category = category;
    }

    public Product(String name, float unitPrice, int quantity, int quantitySell, String category) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.quantitySell = quantitySell;
        this.category = category;
    }
    

    public Product(String id, String name, float unitPrice, int quantity, String category) {
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.category = category;
    }
    
    

    public int getQuantitySell() {
        return quantitySell;
    }

    public void setQuantitySell(int quantitySell) {
        this.quantitySell = quantitySell;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        return true;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", unitPrice=" + unitPrice + ", quantity=" + quantity + ", quantitySell=" + quantitySell + ", category=" + category + '}';
    }

    


    
}
