package co.suman.entity;

public class Employee extends User{
	private String depertment;
	private double salary;
	private String location;
	public Employee() {
		
	}
	public String getDepertment() {
		return depertment;
	}
	public void setDepertment(String depertment) {
		this.depertment = depertment;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Employee [depertment=" + depertment + ", salary=" + salary + ", location=" + location + "]";
	}
	
}
