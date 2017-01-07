package com.bdgolka;

import java.util.Comparator;
import java.util.Objects;

import static java.util.Comparator.comparing;

public class Product {
	//Java 8 Lambda expressions
	//public static final Comparator<Product> BY_WEIGHT = comparing(Product::getWeight);

	public static final Comparator<Product> BY_WEIGHT =
			new Comparator<Product>() {
				@Override
				public int compare(final Product p1, final Product p2) {
					return Integer.compare(p1.getWeight(), p2.getWeight());
				}
			};

	public static final Comparator<Product> BY_NAME = comparing(Product::getName);

	private final int id;
	private final String name;
	private final int weight;
	
	public Product(String name, int weight) {
		id = 0;
		this.name = name;
		this.weight = weight;
	}

	public Product(String name, int weight,int  id) {
		this.id = id;
		this.name = name;
		this.weight = weight;
	}


    //Geters
	public String getName() {
		return name;
	}
	public int getId() { return id; }
	public int getWeight() {
		return weight;
	}
	
    @Override
	public String toString(){
		return "Product{" +
	   "name='" + name +'\'' +
	   ", weight=" + weight + '}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Product product = (Product) o;

		if (weight != product.weight) return false;
		return Objects.equals(name, product.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, weight);
	}
}
