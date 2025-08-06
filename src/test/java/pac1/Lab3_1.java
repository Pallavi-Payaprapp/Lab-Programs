package pac1;

import java.util.Scanner;

class Person4{
	private String firstName;
	private String lastName;
	private char gender;
	public Person4(String firstName,String lastName,char gender)throws InvalidNameException{
		if (firstName==null || firstName.trim().isEmpty()){
            throw new InvalidNameException("First name cannot be empty");
        }
        if (lastName==null || lastName.trim().isEmpty()){
            throw new InvalidNameException("Last name cannot be empty");
        }
		this.firstName=firstName;
		this.lastName=lastName;
		this.gender=gender;
		
	}
	public String getfirstName() {
		 return firstName;
	 }
	 public String getlastName() {
		 return lastName;
	 }
	 public char getgender() {
		 return gender;
	 }
	 public String toString() {
		 return "First Name: " + firstName + "\nLast Name: " + lastName + "\nGender: " + gender;

		 
	 }
}

public class Lab3_1 {

	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter first Name");
			String firstName=sc.nextLine();
			System.out.println("Enter last Name");
			String lastName=sc.nextLine();
			System.out.println("Enter gender");
			char gender=sc.next().charAt(0);
			Person4 p=new Person4(firstName,lastName,gender);
			System.out.println(p);
		}
		catch(InvalidNameException e) {
			System.out.println("Error:"+e.getMessage());
		}

	}

}
