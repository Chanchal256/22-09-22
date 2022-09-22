package com.inheritance.pill;

import com.inheritance.bill.BankAccount;
import com.inheritance.bill.SalaryAccount;
import com.inheritance.bill.BusinessAccount;
import com.inheritance.bill.CurrentAccount;

public class TestBankAccount {
public static void main(String[] args) {
		
		BankAccount acc1 = null;
		//
		System.out.println("1. Salary Account");
		System.out.println("*************");
		
		acc1 = new SalaryAccount(40000);//balance set
		
		System.out.println("Balance: " + acc1.getBalance());
		
		acc1.deposit(6000);//depositing amount
		
		System.out.println("After depositing the balance: " + acc1.getBalance());//balance after depositing
		
		if(acc1.withdraw(10000)) {//withdrawing amount
			System.out.println("Withdrawal happened successfully.");
		}
		else {
			System.out.println("Insufficient balance.");
		}
		
		System.out.println("After withdrawing the balance: " + acc1.getBalance());//balance after withdrawal
		
		
		
	
		
		System.out.println("2. Saving Account");
		System.out.println("*************");
		
		acc1 = new CurrentAccount(20000);//balance set
		
		
		System.out.println("Balance: " + acc1.getBalance());
		
		acc1.deposit(2000);//depositing amount
		
		System.out.println("After depositing the balance: " + acc1.getBalance());//balance after depositing
		
		if(acc1.withdraw(22000)) { //withdrawing amount
			System.out.println("Withdrawal happened successfully.");
		}
		else {
			System.out.println("Insufficient balance.");
		}
		
		System.out.println("After withdrawing the balance: " + acc1.getBalance());//balance after withdrawal
		
		
		
		
		
		
		System.out.println("3. Business Account");
		System.out.println("*************");
		
		acc1 = new BusinessAccount(150000);//set balance
	
		
		System.out.println("Balance: " + acc1.getBalance());
		
		acc1.deposit(5000);//depositing amount
		
		System.out.println("After depositing the balance: " + acc1.getBalance());//balance after depositing
		
		
		if(acc1.withdraw(2000)) { //withdrawing amount
			System.out.println("Withdrawal happened successfully.");
		}
		else {
			System.out.println("Insufficient balance.");
		}
		
		System.out.println("After withdrawing the balance: " + acc1.getBalance());//balance after withdrawal
	}
}
