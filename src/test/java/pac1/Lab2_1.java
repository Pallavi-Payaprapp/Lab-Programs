package pac1;

class Person{
	private String name;
	private float age;
	public Person(String name,float age){
		this.name=name;
		this.age=age;
		
	}
	public String getname() {
		return name;
		
	}
	public void setname(String name) {
		this.name=name;
	}
	public float getage() {
		return age;
	}
	public void setage(float age) { 
		this.age=age;
	}
	public String toString() {
		return "Name: "+name+",Age:"+age;
	}
}
class Account{
	private static long nextAccNum=1001;
	private long accNum;
	private double balance;
	private Person accHolder;
	public Account(double balance, Person accHolder) {
		this.accNum=nextAccNum++;
		this.balance=balance;
		this.accHolder=accHolder;
		
		
	}
	public void deposit(double amount) {
		balance=balance+amount;
		System.out.println(amount+":is deposited account "+accNum);
		
	}
	public void withdraw(double amount) {
		if(amount<=balance) {
			balance=balance-amount;
			System.out.println(amount+":is withdraw from account "+accNum);
		}
		else {
			System.out.println("Insufficient amount");
		}
	}
	public double getBalance() {
		return balance;
	}
	public long getaccNum() {
		return accNum;
	}
	public Person getaccHolder() {
		return accHolder;
	}
	public String toString() {
		return "Account Number:"+accNum+"\nHolder:"+accHolder+"\nBalance:"+balance;
	}
}

public class Lab2_1{
	public static void main(String[] args) {
		Person smith=new Person("smith",30);
		Person Kathy=new Person("Kathy",35);
		Account smithAc=new Account(2000,smith);
		Account KathyAc=new Account(3000,Kathy);
		smithAc.deposit(2000);
		KathyAc.withdraw(2000);
		System.out.println(smithAc);
		System.out.println(KathyAc);
		
		
	}
}

