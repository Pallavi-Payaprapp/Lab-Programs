package pac1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class lab11{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year:");
		int y=sc.nextInt();
	    System.out.println("Enter month:");
	    int m=sc.nextInt();
	    System.out.println("Enter day");
	    int d=sc.nextInt();
	    LocalDate uDate=LocalDate.of(y, m, d);
	    LocalDate curDate=LocalDate.now();
	    Period p=Period.between(uDate, curDate);
	    System.out.println("years:"+Math.abs(p.getYears()));
	    System.out.println("Months:"+Math.abs(p.getMonths()));
	    System.out.println("Days:"+Math.abs(p.getDays()));
	     
	     

	}

}