package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

class Product {
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

}

public class Lambda7 {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(1, "HP LAPTOP", 20000.5f));
		list.add(new Product(2, "Keyboard LAPTOP", 10000.5f));
		list.add(new Product(3, "Samsung Mous", 19000.5f));
		list.add(new Product(4, "Iphone Mous", 28000.5f));
		list.add(new Product(5, "Sony Mous", 10000.5f));
		list.add(new Product(6, "Nokia Mous", 29000.5f));
        System.out.println("=================================");
		
		Collections.sort(list, (p1, p2) -> {
			return p1.name.compareTo(p2.name);

		});
		for (Product product : list) {
			System.out.println(product.id + "  " + product.name + "  " + product.price);
		}
		System.out.println("=================================");
		Stream<Product> filter = list.stream().filter(p->p.price>20000);
		filter.forEach(prod->System.out.println(prod.name+"      "+prod.price));
		}
}
