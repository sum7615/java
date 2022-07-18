package co.suman.entity;


public class Product {

	private int id;
	private String name;
	private String city;
	private int age;
	public Product(){
		throw new RuntimeException("please provide valid entry");
	}
	public Product(int id, String name, String city, int age){
		this.id= id;
		this.age = age;
		this.name= name;
		this.city=city;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", city=" + city + ", age=" + age + "]";
	}
	
}
