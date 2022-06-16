package com.zensar.beans;

import org.springframework.stereotype.Component;


public class Product {

	private int productId;
	private String productName;
	private int productCost;

	public Product()
	{
		super();
		System.out.println("Inside product Bean ! ! !");
	}
	
	

	public Product(String productId, String productName, String productCost) {
		System.out.println("inside product string");
		
	}



	public Product(int productId, String productName, int productCost) {
		super();
		System.out.println("inside the constructor");
		this.productId = productId;
		this.productName = productName;
		this.productCost = productCost;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId)
	{
		System.out.println("inside the productId");
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		System.out.println("inside the productName");
		this.productName = productName;
	}

	public int getProductCost() {
		return productCost;
	}

	public void setProductCost(int productCost) 
	{
		System.out.println("inside the productCost");
		this.productCost = productCost;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productCost=" + productCost
				+ "]";
	}

}
