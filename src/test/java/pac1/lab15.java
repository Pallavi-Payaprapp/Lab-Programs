package pac1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class lab15 {
	public static int calculateAge(LocalDate dob) {
        LocalDate today = LocalDate.now();
        return Period.between(dob, today).getYears();
    }
	public static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Name: ");
        String firstName=sc.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName=sc.nextLine();
        System.out.print("Enter Date of Birth: ");
        String dobInput=sc.nextLine();
        LocalDate dob=LocalDate.parse(dobInput);
        String fullName=getFullName(firstName, lastName);
        int age=calculateAge(dob);
        System.out.println("Full Name:"+fullName);
        System.out.println("Age:"+age);
		
		
		
		

	}

}
