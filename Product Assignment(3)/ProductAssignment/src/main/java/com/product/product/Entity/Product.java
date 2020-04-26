package com.product.product.Entity;
public class Product {

	private String productName;
	private int productId;
	private double productPrice;
	public Product(int pId, String pName, double pPrice) {
		this.productId = pId;
		this.productName = pName;
		this.productPrice = pPrice;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	
}
