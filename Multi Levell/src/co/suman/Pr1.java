package co.suman;
import co.suman.entity.*;

public class Pr1 {
	public static void main(String[] args) {
		Manager m1= new Manager();
		m1.setId(1500);
		m1.setName("Suman");
		m1.setDepertment("Biology");
		m1.setLocation("Block 28");
		m1.setSalary(15872.00);
		m1.setDegnation("Analyst");
		m1.setReportTo("Shrini");
		m1.setMobileNumber(7308644283l);
		
		System.out.println(m1.getName()+" loves "+m1.getReportTo());
	}

}
