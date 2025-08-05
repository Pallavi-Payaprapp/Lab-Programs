package pac1;
class Acc{
	 private double balance;
	 public Acc(double balance) {
		 this.balance=balance;
		
	}
	 public void deposit(double amount) {
		 balance=balance+amount;
	 }
	 public boolean withdraw(double amount) {
		 return false;
	 }
	 public double getbalance() {
		 return balance;
	 }
	 public void setbalance(double balance) {
		 this.balance=balance;
	 }
}
class SavingAccount extends Acc{
	private static final double min_bal=500;
	public SavingAccount(double balance) {
		super(balance);
		
	}
	public boolean withdraw(double amount) {
		if(getbalance()-amount>min_bal) {
			System.out.println(amount+":is withdraw from account");
			return true;
		}
		else {
			System.out.println("Insufficient amount");
			return false;
		}
	}
}
class CurrentAccount extends Acc{
	private double overDraftLimit;
	public CurrentAccount(double balance,double overDraftLimit) {
		super(balance);
		this.overDraftLimit=overDraftLimit;
	}
	public boolean withdraw(double amount) {
		if(getbalance()-amount>=-overDraftLimit) {
			setbalance(getbalance()-amount);
			System.out.println(amount+":is withdraw from account");
			return true;
		}
		else {
			System.out.println("cannot withdraw");
			return false;
		}
		
		
	}
	
	
}
public class Lab2_2{

	public static void main(String[] args) {
		SavingAccount s=new SavingAccount(1000);
        s.withdraw(300);

        CurrentAccount c=new CurrentAccount(500, 300);
        c.withdraw(900);
   
		
		
	}

}
