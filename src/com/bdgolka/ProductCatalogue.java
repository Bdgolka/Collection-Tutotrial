package com.bdgolka;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by bdgolka on 02.01.2017.
 */
public class ProductCatalogue implements Iterable<Product> {

    private final Set<Product> products = new HashSet<>();

    public void isSuppliedBy(Supplier supplier){
        products.addAll(supplier.products());
    }
    public Iterator<Product> iterator() {
        return products.iterator();
    }
}
