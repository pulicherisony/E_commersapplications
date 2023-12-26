package com.simplilearn.testng;

import java.util.HashMap;

public class StockManagement {

	HashMap<Integer,Product> product=new HashMap<>();
	
	public void addProduct(Product prod) {
		product.put(prod.getProductId(), prod);
		
	}
	public Product searchProduct(int productId) {
		return product.getOrDefault(productId, null);
	}
	public void displayInventory() {
		System.out.println("Inventory :");
		for(Product prod:product.values()) {
			System.out.println(prod);
			
		}
	}
}
