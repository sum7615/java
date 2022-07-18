package co.suman;
import co.suman.entity.*;
public class Program1 {
public static void main(String[] args) {
	Depertment d1= new Depertment("Biology","Block 58");
	Depertment d2 =new Depertment("MBA","Block 14");
	Employee e1=new Employee("Suman",1002.52,d1);
	e1.print();
	Employee e2=new Employee();
	e2.setDepertment(d2);
	e2.setName("Shrini");
	e2.setSalary(158754.00);
	System.out.println(e2);
	System.out.println(e2.getName()+" belongs to the depertment of "+e2.getDepertment().getName());
}
}
