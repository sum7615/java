package co.suman.file;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialize {
	public static void main(String[] args) throws Exception {
		Product[] p1 = {
				new Product(1,"Pen",10.00),
				new Product(2,"Note",100.00),
				new Product(3,"Book",1000.00),
		};
		FileOutputStream file = new FileOutputStream("product.dat");
		ObjectOutputStream out = new ObjectOutputStream (file);
		
		for(int i=0;i<p1.length;i++) {
		out.writeObject(p1[i]);
		}
		System.out.println("End of Demo");
		out.close();
		file.close();				
	}

}
