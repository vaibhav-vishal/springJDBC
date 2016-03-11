package com.training.entity;

import org.springframework.stereotype.Component;

@Component("product")
public class Product {
	private String productName;
	private String productType;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String productName, String productType) {
		super();
		this.productName = productName;
		this.productType = productType;
	}

	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productType=" + productType + "]";
	}

	
	
	
}