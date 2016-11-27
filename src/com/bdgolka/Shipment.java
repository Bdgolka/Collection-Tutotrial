package com.bdgolka;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Created by bdgolka on 26.11.2016.
 */
public class Shipment implements Iterable<Product> {

    public static final int LIGHT_VAN_MAX_WEIGHT = 20;

    private List<Product> products = new ArrayList<>();

    public void add(Product product){
        products.add(product);
    }

    public void replace (Product  oldProduct, Product newProduct){
        //TODO
    }

    @Override
    public Iterator<Product> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Product> action) {

    }

    @Override
    public Spliterator<Product> spliterator() {
        return null;
    }
}
