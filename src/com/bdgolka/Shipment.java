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
    public static final int PRODUCT_NOT_PRESENT = -1;

    private List<Product> products = new ArrayList<>();

    public void add(Product product){
        products.add(product);
    }

    public List<Product> lightVanPRoducts;
    public List<Product> heavyVanPRoducts;

    public void replace (Product  oldProduct, Product newProduct){

        final int index = products.indexOf(oldProduct);
        if(index!=PRODUCT_NOT_PRESENT)
        {
            products.set(index, newProduct);
        }
    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }

    @Override
    public void forEach(Consumer<? super Product> action) {

    }

    @Override
    public Spliterator<Product> spliterator() {
        return null;
    }

    public void prepare() {
        //sort our list of products by weight
        products.sort(Product.BY_WEIGHT);

        //find the product index that needs the heavy van
        int splitPoint = findSplitPoint();

        //assign views of the products list for heavy and light vans
        lightVanPRoducts = products.subList(0, splitPoint);
        heavyVanPRoducts = products.subList(splitPoint, products.size());
    }

    private int findSplitPoint() {
    for(int i = 0; i < products.size(); i++){
        final Product product = products.get(i);

        if(product.getWeight() > LIGHT_VAN_MAX_WEIGHT)
            return i;
    }
           return 0;
    }

    public  List<Product> getLightVanProducts() {return lightVanPRoducts;}

    public List<Product> getHeavyVanProducts() {return heavyVanPRoducts;}
}
