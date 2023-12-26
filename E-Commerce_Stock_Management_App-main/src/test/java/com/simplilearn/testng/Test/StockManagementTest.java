package com.simplilearn.testng.Test;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.simplilearn.testng.Product;
import com.simplilearn.testng.StockManagement;

public class StockManagementTest {
	private StockManagement stockManager;
    private Product p1;
    private Product p2;
    private Product p3;
    private Product p4;
    private Product p5;
    private Product p6;

    @BeforeMethod
    public void setUp() {
        stockManager = new StockManagement();
         p1=new Product(1,"Laptops",20);
		 p2=new Product(2,"MObiles",29);
         p3=new Product(3,"Snacks",58);
		
         p4=new Product(4,"Shirts",78);
		 p5=new Product(5,"Sarees",93);
		 p6=new Product(6,"Books",72);

        stockManager.addProduct(p1);
        stockManager.addProduct(p2);
        stockManager.addProduct(p3);
        stockManager.addProduct(p4);
        stockManager.addProduct(p5);
        stockManager.addProduct(p6);
    }

    @Test
    public void testSearchProductExists() {
        int searchProductId = 1;
        Product searchedProduct = stockManager.searchProduct(searchProductId);

        assertNotNull(searchedProduct);
        assertEquals(searchProductId, searchedProduct.getProductId());
    }

    @Test
    public void testSearchProductNotExists() {
        int searchProductId = 9; 
        Product searchedProduct = stockManager.searchProduct(searchProductId);

        assertNull(searchedProduct);
    }

  

}
