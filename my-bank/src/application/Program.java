package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account cc1 =  new Account(111, "Bob", 1000.0);
		cc1.withdraw(200.0);
		System.out.println(cc1.getBalance());
		
		Account cc2 = new SavingsAccount(222, "Maria", 800.0, 2.0);
		cc2.withdraw(100.00);
		System.out.println(cc2.getBalance());
		
		Account cc3 = new BusinessAccount(333, "Alex", 800.0, 1000.0);
		cc3.withdraw(200.0);
		System.out.println(cc3.getBalance());
	}
}
