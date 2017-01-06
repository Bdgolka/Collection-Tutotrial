package com.bdgolka;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by bdgolka on 02.01.2017.
 */
public class ProductCatalogue implements Iterable<Product> {

    private final SortedSet<Product> products = new TreeSet<>(Product.BY_WEIGHT);

    public void isSuppliedBy(Supplier supplier){
        products.addAll(supplier.products());
    }

    public Iterator<Product> iterator() {

        return products.iterator();
    }

    public Set<Product> lightVanProducts() {

        Product heaviestLightVanProduct = findHeaviestLightProduct();
        return products.headSet(heaviestLightVanProduct);
    }

    private Product findHeaviestLightProduct() {

        for(Product product : products){
            if(product.getWeight() > 20){
                return  product;
            }
        }
        return products.last();
    }

    public Set<Product> heavyVanProducts() {

        Product heaviestLightVanProduct = findHeaviestLightProduct();
        return products.tailSet(heaviestLightVanProduct);
    }
}
