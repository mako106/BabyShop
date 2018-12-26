/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baby.shop.enity;

import java.util.Objects;

/**
 *
 * @author chien
 */
public class Product {
    private int id;
    private  String name;
    private float price;
    private  String discription;    

    @Override
    public int hashCode() {
        int hash = 5;
        hash =11*hash + this.id;
        
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        
        if (obj == null || !(obj instanceof Product)) {
            return false;
        }
        Product other = (Product) obj;
        
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", price=" + price + ", discription=" + discription + '}';
    }

    public Product(int id, String name, float price, String discription) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discription = discription;
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
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }
}
