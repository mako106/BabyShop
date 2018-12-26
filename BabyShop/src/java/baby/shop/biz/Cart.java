/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baby.shop.biz;

import baby.shop.enity.Product;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author chien
 */
public class Cart {

    private final Map<Product, Integer> cart = new HashMap<Product, Integer>();

    public Cart() {
    }

    public void addProduct(Product p) {
        Integer amout = cart.get(p);
        cart.put(p, amout == null ? 1 : (amout + 1));
    }

    public Map<Product, Integer> getProduct() {
        return cart;

    }

    public float getTotalPrice() {
        float total = 0;
        Set<Product> keys = cart.keySet();
        for (Product product : keys) {
            total += product.getPrice() * cart.get(product);
        }
        return total;
    }

    public Map<Product, Integer> getProducts() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
