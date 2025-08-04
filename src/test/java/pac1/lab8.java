package pac1;

public class lab8{
	public enum Gender{
		M,F;
	}
	String firstName;
	 String lastName;
	 Gender gender;
	 String phoneNumber;
	 public lab8(String firstName,String lastName,Gender gender,String phoneNumber ) {
		 this.firstName=firstName;
		 this.lastName=lastName;
		 this.gender=Gender.F;
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
	 public Gender getGender() {
		 return gender;
	 }
	 public void setGender(Gender gender) {
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
		lab8 p=new lab8("pallavi","payaprapp",Gender.F,"99999999");
		p.display();
		

	}

}
