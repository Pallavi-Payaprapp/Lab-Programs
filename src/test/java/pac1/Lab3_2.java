package pac1;
class Person3{
	private String name;
	private float age;
	public Person3(String name,float age)throws InvalidAgeException{
		if(age<=15) {
			throw new InvalidAgeException("Age must be above 15:");
		}
		this.name=name;
		this.age=age;
	}
	public String getname() {
		return name;
	}
	public float getage() {
		return age;
	}
	public void setname() {
		this.name=name;
	}
	public void setage() {
		this.age=age;
	}
	public String toString() {
		return "Name:"+name+"\nAge:"+age;
	}
}
class Account3{ 
	private static long accNextacc=1000;
	private long accNum;
	private double balance;
	private Person3 accHolder;
	public Account3(double balance,Person3 accHolder) {
		this.accNum=accNextacc++;
		this.balance=balance;
		this.accHolder=accHolder;
	}
	public void deposit(double amount) {
		balance=balance+amount;
	}
	public void withdraw(double amount) {
		if(amount<=balance) {
			balance=balance-amount;
			System.out.println(amount+":withdraw from account:"+accNum);
		}
		else {
			System.out.println("Insufficient amount");
		}
	}
	public double getbalance() {
		return balance;
	}
	public String toString() {
		return "Account Number:"+accNum+"\nAccount Holder:"+accHolder.getname()+"\nBalance:"+balance;
	}
	
}

public class Lab3_2 {
	

	public static void main(String[] args) {
		Person3 smith;
		try {
			Person3 smith1 = new Person3("Smith",30);
			Account3 smithacc=new Account3(2000,smith1);
			Person3 kathy=new Person3("Kathy",5);
			Account3 kathyacc=new Account3(3000,kathy);
			smithacc.deposit(2000);
			kathyacc.withdraw(2000);
			System.out.println(smithacc);
			System.out.println(kathyacc);
			
			
		} 
		catch (InvalidAgeException e) {
			
			System.out.println("Error:"+e.getMessage());
		}
		
		
		
		

	}

}
