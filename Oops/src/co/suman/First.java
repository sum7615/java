package co.suman;
import java.util.Scanner;

import co.suman.entity.Product;

public class First {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the product in order of id, name, city, age");
		Product p1 = new Product(10,"Suman","Delhi",120);
		System.out.println(p1);
		Product p2 = new Product();
		System.out.println(p2);
		sc.close();
	}
}
