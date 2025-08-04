package pac1;

import java.time.LocalDate;
import java.util.Scanner;

public class lab13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter purchase date:");
        String date=sc.nextLine();
        LocalDate pDate=LocalDate.parse(date);
        System.out.print("Enter warranty years:");
        int y= sc.nextInt();
        System.out.print("Enter warranty months:");
        int m= sc.nextInt();
        LocalDate expiryDate = pDate.plusYears(y).plusMonths(m);
        System.out.println("Warranty expires on: " + expiryDate);

	}

}