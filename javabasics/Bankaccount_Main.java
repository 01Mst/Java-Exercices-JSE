package javabasics;

public class Bankaccount_Main {

	public static void main(String[] args) {
	Bank_Account b=new Bank_Account(123,"Thulasimani",100000);
	b.deposit(100000);
	b.withdraw(350);
	b.currentbalance();
	

	}

}
