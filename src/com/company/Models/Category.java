package com.company.Models;

import java.util.List;

public class Category {
	private String name;
	private List<Products> products;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Products> getProducts() {
		return products;
	}
	public void setProducts(List<Products> products) {
		this.products = products;
	}
	
}
