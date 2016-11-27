package com.bdgolka;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Sample {
	
	public static void main(String[] args) {

		Product door = new Product("Wooden Door", 35);
		Product floorPanel = new Product("Floor Panel", 25);
		Product window = new Product("Glass Window", 18);

		Collection<Product> products = new ArrayList<>();
		products.add(door);
		products.add(window);
		products.add(floorPanel);

		final Iterator<Product> productIterator = products.iterator();
		while (productIterator.hasNext()) {
			Product product = productIterator.next();
			if(product.getWeight() > 20)
			{
			System.out.println(product);
			}
			else
			{
			productIterator.remove();
			}
		}

		System.out.println(products.size());
		System.out.println(products.isEmpty());

		System.out.println(products.contains(window));
		System.out.println(products.contains(door));

		Collection<Product> _otherProducts = new ArrayList<>();
		_otherProducts.add(door);
		_otherProducts.add(window);
		_otherProducts.add(floorPanel);

		products.removeAll(_otherProducts);
		System.out.println(products);
	}	
}
