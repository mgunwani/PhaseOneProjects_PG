package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product {
	int id;
	String name;
	int price;
	public Product(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}

public class ProductStreamExample {
	
	public static void main(String[] args) {
		
		
		List<Product> products = new ArrayList<Product>();
		products.add(new Product(101, "HardDisk", 10000));
		products.add(new Product(102, "RAM", 20000));
		products.add(new Product(103, "Printer", 15000));
		
//		List<Product> productPriceList = new ArrayList<Product>();
//		for (Product product : products) {
//			if(product.price < 18000) {
//			productPriceList.add(product);	
//			}
//		}
//		System.out.println(productPriceList.toString());
		
		List<Product> productPriceList = products.stream()
				.filter(p -> p.price < 18000)
				.map(p -> p)
				.collect(Collectors.toList());
		System.out.println(productPriceList);
				
		
		
		
	}

}
