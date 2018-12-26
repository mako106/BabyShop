/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baby.shop.model;

import baby.shop.biz.Cart;
import baby.shop.enity.Product;
import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;

/**
 *
 * @author chien
 */
public class ViewCart extends ActionSupport{
    private Map<Product, Integer> products;
    private float total;

    @Override
   public String execute() throws Exception {
        Cart cart = (Cart) ActionContext.getContext().getSession().get("cart");
        if (cart == null) {
            return ERROR;
        }
        products = cart.getProducts();
        total = cart.getTotalPrice();
        return SUCCESS;
    }
    
    
    public Map<Product, Integer> getProducts(){
        return products;
    }
    
    public float getTotal(){
        return total;
    }
}
