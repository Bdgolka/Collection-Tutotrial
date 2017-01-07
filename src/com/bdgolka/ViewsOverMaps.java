package com.bdgolka;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by bdgolka on 07.01.2017.
 */
public class ViewsOverMaps {

    public static void main(String[] args) {

        final Map<Integer, Product> idToProduct = new HashMap<>();

        idToProduct.put(1, ProductFixtures.door);
        idToProduct.put(2, ProductFixtures.floorPanel);
        idToProduct.put(3, ProductFixtures.window);

        System.out.println(idToProduct);
        System.out.println();

        final Set<Integer> ids = idToProduct.keySet();
        System.out.println(ids);

        ids.remove(1);
        System.out.println(ids);
        System.out.println(idToProduct);
        System.out.println();

        //ids.add(4); throws an exception because there is nno value associated with the key

        final Collection<Product> products = idToProduct.values();
        System.out.println(products);
        System.out.println();

        products.remove(ProductFixtures.floorPanel);
        System.out.println(products);
        System.out.println(idToProduct);
        System.out.println();

        //Using to iterate over collection
        final Set<Map.Entry<Integer, Product>> entries = idToProduct.entrySet();

        for (Map.Entry<Integer, Product> entry : entries){

            System.out.println(entry.getKey() + " -> " + entry.getValue());
            entry.setValue(ProductFixtures.floorPanel);
        }

        System.out.println(idToProduct);
    }
}
