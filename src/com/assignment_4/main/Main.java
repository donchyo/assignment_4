package com.assignment_4.main;

import com.assignment_4.subclasses.BankCustomer;
import com.assignment_4.subclasses.PersonalAccount;
import com.assignment_4.subclasses.SavingAccount;
import com.assignment_4.superclasses.BankAccount;

public class Main {
	public static void main(String[] args){
		/*
		BankCustomer Daniel = new BankCustomer("Daniel", 21);
		System.out.println(Daniel.toString());
		
		BankAccount bankAccount = new BankAccount();
		System.out.println(bankAccount.toString());
		bankAccount.depositMoney(200.0);
		
		PersonalAccount pa = new PersonalAccount();
		pa.depositMoney(70);
		System.out.println(pa.toString());
		pa.depositMoney(-1);
		
		SavingAccount sa = new SavingAccount();
		sa.withdrawMoney(-20);
		sa.withdrawMoney(20);
		System.out.println(sa.toString());
		*/
		
		String account = "";
		
		BankCustomer bc = new BankCustomer("Rafael", 30);
		bc.addAccount(new BankAccount());
		bc.addAccount(new PersonalAccount());
		bc.addAccount(new SavingAccount());
		System.out.println(bc.toString());
		
		account = bc.getCustomerAccounts().get(0).getAccountNumber();
		System.out.println("Depositing 30.0 to the first account");
		bc.depositToAccount(account, 30.0);
		System.out.println(bc.toString());
		
		System.out.println("Withdrawing 200.0 to the first account");
		account = bc.getCustomerAccounts().get(1).getAccountNumber();
		System.out.println(bc.toString());
		
		System.out.println("Depositing 200.0 to the first account");
		account = bc.getCustomerAccounts().get(2).getAccountNumber();
		bc.depositToAccount(account, 200.0);
		System.out.println(bc.toString());
		
		
		
	}

}

