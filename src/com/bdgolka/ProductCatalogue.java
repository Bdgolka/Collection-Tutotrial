package com.bdgolka;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by bdgolka on 02.01.2017.
 */
public class ProductCatalogue implements Iterable<Product> {

    private final Set<Product> products = new TreeSet<>(Product.BY_NAME);

    public void isSuppliedBy(Supplier supplier){
        products.addAll(supplier.products());
    }
    public Iterator<Product> iterator() {
        return products.iterator();
    }
}
