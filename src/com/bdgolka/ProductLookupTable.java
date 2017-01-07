package com.bdgolka;

/**
 * Created by bdgolka on 07.01.2017.
 */
public interface ProductLookupTable {

    Product lookupById (int id);

    void addProduct (Product productToAdd);

    void clear();
}
