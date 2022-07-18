package co.suman.file;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFIleByChar {
	public static void main(String[] args) throws Exception {
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter a valid path to read file");
		String path = sc.nextLine();
		FileReader file = new FileReader(path);
		int ch;
		while((ch=file.read())!=-1) {
			System.out.print((char) ch);
		}
		file.close();
		sc.close();
	}

}
