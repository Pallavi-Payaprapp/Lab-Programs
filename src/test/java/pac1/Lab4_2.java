package pac1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Lab4_2 {

	public static void main(String[] args) throws IOException {
		File file=new File("numbers.txt");
		FileWriter w=new FileWriter(file);
		for(int i=0;i<=10;i++) {
			w.write(i+(i<10?",":""));
			
		}
		w.close();
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int n=Integer.parseInt(sc.next().trim());
			if(n%2==0) {
				System.out.print(n+" ");
			}
		}
		sc.close();
		
		
		

	}

}
