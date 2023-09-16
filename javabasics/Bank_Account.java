package javabasics;

public class Bank_Account {
	private long acc_no;
	private double acc_balance;
	private String acc_name;
	public void deposit(double amt) {
		if(amt>0) {
			acc_balance=acc_balance+amt;
			System.out.println("Successfully Deposited Rs. " + acc_balance);
		}else{
			System.out.println("Cannot Deposit.");	
				}
		}
	public void withdraw(double amt ) {
		if(amt>0) {
			acc_balance=acc_balance-amt;
			System.out.println("Sucessfully withdraw Rs. "+amt);
		}
		else {
			System.out.println("Cannot Withdraw.");
		}
	}
	public void currentbalance() {
		System.out.println("Your current balance is Rs. "+acc_balance);
	}
	public Bank_Account(long acc_no,String acc_name,double acc_balance) {
		this.acc_no=acc_no;
		this.acc_name=acc_name; 
		this.acc_balance=acc_balance;
	}
	}


