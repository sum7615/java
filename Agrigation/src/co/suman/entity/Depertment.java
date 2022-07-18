package co.suman.entity;

public class Depertment {
	private static int counter;
	private String id;
	private String name;
	private String location;
	public Depertment(){
		id="DEP1000"+(++counter);
	}
	public Depertment(String name, String location) {
		this();
		this.name=name;
		this.location=location;
	}
	public void setLocation(String location) {
		this.location=location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	
	public void print() {
		System.out.println("Depertment information");
		System.out.println("Id        :"+id);
		System.out.println("Name      :"+name);
		System.out.println("Loacation :"+location);
	}
	@Override
	public String toString() {
		return "Depertment [ id= "+id+", name= "+name+", location= "+location+" ]";
	}
	
}
