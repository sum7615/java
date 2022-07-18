package co.suman.entity;

public class Product {
	private static long counter=10;
	private final String id;
	private String name;
	private double price;

	public Product() {
		id="PRDT-2022-"+(++counter);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public void print() {
		System.out.println("Id = "+id);
		System.out.println("Name = "+name);
		System.out.println("Price = "+price);
	}

}
