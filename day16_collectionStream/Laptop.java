package com.onesoft.day16_collectionStream;

public class Laptop {
	
	private String brand;
	private int price;
	private String processor;
	private boolean isTouchScreeen;
	private String color;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public boolean isTouchScreeen() {
		return isTouchScreeen;
	}
	public void setTouchScreeen(boolean isTouchScreeen) {
		this.isTouchScreeen = isTouchScreeen;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Laptop(String brand, int price, String processor, boolean isTouchScreeen, String color) {
		super();
		this.brand = brand;
		this.price = price;
		this.processor = processor;
		this.isTouchScreeen = isTouchScreeen;
		this.color = color;
	}
	@Override
	public String toString() {
		return "Laptop brand=" + brand + ", price=" + price + ", processor=" + processor + ", isTouchScreeen="
				+ isTouchScreeen + ", color=" + color ;
	}
	
	

}
