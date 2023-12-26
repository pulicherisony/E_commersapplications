package com.simplilearn.testng;

import java.util.Scanner;

public class StockManagementApp {

	public static void main(String[] args) {
		StockManagement app=new StockManagement();
		Product p1=new Product(1,"Laptops",20);
		Product p2=new Product(2,"MObiles",29);
		Product p3=new Product(3,"Snacks",58);
		Product p4=new Product(4,"Shirts",78);
		Product p5=new Product(5,"Sarees",93);
		Product p6=new Product(6,"Books",72);
		app.addProduct(p6);
		app.addProduct(p1);
		app.addProduct(p2);
		app.addProduct(p3);
		app.addProduct(p4);
		app.addProduct(p5);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Product id:");
		int id=sc.nextInt();
		Product searchProduct=app.searchProduct(id);
		
		
		if(searchProduct!=null) {
			System.out.println("Product Found!!!");
			System.out.println(searchProduct);
		}else {
			System.out.println(id +":-> This product not found in the Stock management applications");
		}
		app.displayInventory();
		sc.close();
	}

}
