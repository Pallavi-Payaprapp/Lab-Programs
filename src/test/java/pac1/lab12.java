package pac1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class lab12{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first date");
		System.out.println("Enter year:");
		int y1=sc.nextInt();
		System.out.println("Enter month");
		int m1=sc.nextInt();
		System.out.println("Enter day");
		int d1=sc.nextInt();
		System.out.println("Enter second date");
		System.out.println("Enter year");
		int y2=sc.nextInt();
		System.out.println("Enter month");
		int m2=sc.nextInt();
		System.out.println("Enter day");
		int d2=sc.nextInt();
		LocalDate date1=LocalDate.of(y1,m1,d1);
		LocalDate date2=LocalDate.of(y2,m2,d2);
		Period p=Period.between(date1, date2);
		System.out.println("Duration in years:"+Math.abs(p.getYears()));
		System.out.println("Duration in months:"+Math.abs(p.getMonths()));
		System.out.println("Duration in days:"+Math.abs(p.getDays()));
		
		

	}

}
