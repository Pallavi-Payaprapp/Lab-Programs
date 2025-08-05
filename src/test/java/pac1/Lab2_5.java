package pac1;
class Person1{
	private String name;
	private float age;
	public Person1(String name,float age) {
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
abstract class Account2{
	static long nextAccNum=1001;
	long accNum;
	double balance;
	Person1 accHolder;
	public Account2(double balance, Person1 accHolder) {
		this.accNum=nextAccNum++;
		this.balance=balance;
		this.accHolder=accHolder;
	}
	public void deposit(double amount) {
		balance=balance+amount;
		System.out.println(amount+":is deposited account "+accNum);
		
	}
	abstract void withdraw(double amount);
	public double getBalance() {
		return balance;
	}
	public String toString() {
		return "Account Number:"+accNum+"\nHolder:"+accHolder+"\nBalance:"+balance;
	}
}
class savingAccount1 extends Account2{
	public savingAccount1(Person1 accHolder,double balance){
		super(balance,accHolder);
	}
	void withdraw(double amount) {
		if(amount<=balance) {
			balance=balance-amount;
			System.out.println(amount+":is withdraw from account "+accNum);
		}
		else {
			System.out.println("Insufficient amount");
		}
	}
}


public class Lab2_5 {

	public static void main(String[] args) {
		Person1 smith=new Person1("Smith",30);
		Person1 kathy=new Person1("Kathy",35);
		savingAccount1 a1=new savingAccount1(smith,2000);
		savingAccount1 a2=new savingAccount1(kathy,3000);
		a1.deposit(2000);
		a2.withdraw(2000);
		System.out.println(a1);
		System.out.println(a2);
		
		

	}

}
