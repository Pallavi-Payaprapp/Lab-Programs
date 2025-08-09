package pac1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lab4_1 {

	public static void main(String[] args) throws IOException {
		File file = new File("sample.txt");
		FileWriter w=new FileWriter(file);
		w.write("Hello World");
		w.close();
		System.out.println("Sample.txt created with default content");
		FileReader r=new FileReader(file);
		StringBuilder sb=new StringBuilder();
		int ch;
		while((ch=r.read())!=-1) {
			sb.append((char)ch);
		}
		r.close();
		sb.reverse();
		FileWriter w1=new FileWriter(file);
		w1.write(sb.toString());
		w1.close();
		System.out.println("File content reversed sucessfully");
		
		
		

	}

}
