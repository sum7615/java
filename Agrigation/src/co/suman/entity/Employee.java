package co.suman.entity;

public class Employee {
	String id;
	int counter;
	String name;
	double salary;
	private Depertment depertment =new Depertment();
	public Employee() {
		id="EMP1000"+(++counter);
	}
	public Employee(String name, double salary, Depertment depertment) {
		this();
		this.name=name;
		this.salary=salary;
		this.depertment=depertment; 
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Depertment getDepertment() {
		return depertment;
	}
	public void setDepertment(Depertment depertment) {
		this.depertment = depertment;
	}
	public void print() {
		System.out.println("Employee information");
		System.out.println("Id :"+id);
		System.out.println("Name :"+name);
		System.out.println("Salary :"+salary);
		depertment.print();
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", counter=" + counter + ", name=" + name + ", salary=" + salary + ", depertment="
				+ depertment + "]";
	}
	
	
}
