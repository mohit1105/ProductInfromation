package com.businesslogic;

public class Product {
	private int id;
	private String productname;
	private String productprice;
	private String date;

	
	
	public Product(int id, String productname, String productprice, String date) {
		super();
		this.id = id;
		this.productname = productname;
		this.productprice = productprice;
		this.date = date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getproductname() {
		return productname;
	}

	public void setproductname(String productname) {
		this.productname = productname;
	}

	public String getproductprice() {
		return productprice;
	}
	public void setproductprice(String productprice) {
		this.productprice = productprice;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	
	@Override
	public String toString() {
		return "Product ---- Id=" + id + ", Date=" + date + ", Product Name=" + productname + ", Product Price=" + productprice + ".";
	}
}
