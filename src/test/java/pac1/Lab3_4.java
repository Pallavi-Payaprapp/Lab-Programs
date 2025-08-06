package pac1;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3_4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the products name");
		String p[]=new String[size];
		for(int i=0;i<p.length;i++) {
			p[i]=sc.nextLine();
		}
		Arrays.sort(p);
		System.out.print("Sorted products name:");
		for(int i=0;i<p.length;i++) {
			System.out.print(p[i]+" ");
		}
		sc.close();
		

	}

}
