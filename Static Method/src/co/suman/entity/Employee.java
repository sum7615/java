package co.suman.entity;

public class Employee {
	
private static long counter;
private final long id;
static {
	counter =1000;
}
public Employee(){
	id=++counter;
}
public Employee(String name, double salary){
	this();
	this.name=name;
	this.salary=salary;
}
private String name;
private double salary;

public void setName(String name) {
	this.name=name;
}
public void setSalary(double salary) {
	this.salary=salary;
}
public double getSalary() {
	return salary;
}
public String getName() {
	return name;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}


}
