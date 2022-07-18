package co.suman;
import co.suman.entity.*;
public class Main {
public static void main (String[] args) {
	System.out.println("Value of pi is: "+Math.PI);
	Circle c1,c2,c3;
	c1 = new Circle(1.2);
	c2 = new Circle(2.4);
	c3= new Circle(3.5);
	c1.printRadius();
	c2.printRadius();
	c3.printRadius();
	
}
	
}

