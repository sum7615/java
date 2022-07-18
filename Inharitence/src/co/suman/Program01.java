package co.suman;
import co.suman.entity.*;
public class Program01 {
	public static void main(String[] args) {
		TV t1= new TV();
		t1.setName("Sony Bravia");
		t1.setPrice(12500.0);
		t1.setType("TV");
		t1.setScreenSize("24 inch");
		t1.print();
	}
}
