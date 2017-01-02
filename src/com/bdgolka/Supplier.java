package com.bdgolka;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bdgolka on 02.01.2017.
 */
public class Supplier {

    private String name;
    private List<Product> products = new ArrayList<Product>();

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Supplier(String name) {
        this.name = name;

    }

    public List<Product> products(){
        return products;
    }
}
