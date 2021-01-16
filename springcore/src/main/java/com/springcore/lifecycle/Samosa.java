package com.springcore.lifecycle;

public class Samosa {

	private double price;

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void init() {
		System.out.println("inside init");
	}
	public void destroy() {
		System.out.println("inside destroy");
	}
}
