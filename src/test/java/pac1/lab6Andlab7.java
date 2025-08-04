package pac1;

public class lab6Andlab7{
	String firstName;
	 String lastName;
	 char gender;
	 String phoneNumber;
	 public lab6Andlab7(String firstName,String lastName,char gender,String phoneNumber ) {
		 this.firstName=firstName;
		 this.lastName=lastName;
		 this.gender=gender;
		 this.phoneNumber=phoneNumber;
	}
	 public String getfirstName() {
		 return firstName;
	 }
	 public void setfirstName(String firstName) {
		 this.firstName=firstName;
	 }
	 public String getlastName() {
		 return lastName;
	 }
	 public void setlastName(String lastName) {
		 this.lastName=lastName;
	 }
	 public char getgender() {
		 return gender;
	 }
	 public void setgender(char gender) {
		 this.gender=gender;
	 }
	 public String getphoneNumberr() {
		 return phoneNumber;
	 }
	 public void setphoneNumber(String phoneNumber) {
		 this.phoneNumber=phoneNumber;
		 
	 }
	 public void display() {
		 System.out.println("First Name:"+firstName);
		 System.out.println("Last Name:"+lastName);
		 System.out.println("Gender:"+gender);
		 System.out.println("Phone Number:"+phoneNumber);
	 }

	public static void main(String[] args) {
		lab6Andlab7 p=new lab6Andlab7("pallavi","payaprapp",'f',"99999999");
		p.display();
		

	}

}
