package co.suman;

import co.suman.entity.Employee;

public class EmployeeProgram {
	public static void main(String[] args) {
		Employee e1= new Employee();
		e1.setName("Suman");
		e1.setSalary(12000);
		Employee e2= new Employee("Sonali",50000);
		Employee e3 = new Employee("Shrini", 155000);
	System.out.println(e1);
	System.out.println(e2);
	System.out.println(e3);
}
}