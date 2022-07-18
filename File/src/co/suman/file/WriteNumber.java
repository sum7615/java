package co.suman.file;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

class WriteNumber {
	public static void main(String[] args) throws Exception {

	FileOutputStream file= new FileOutputStream("number.dat");
	DataOutputStream out = new DataOutputStream(file);
	out.writeDouble(11.64);	
	out.writeDouble(18.64);
	out.writeInt(2424);
	
	
	file.close();
	out.close();
	System.out.println("End of Demo");
	
	}
	}