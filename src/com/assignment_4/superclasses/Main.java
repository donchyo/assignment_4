package com.assignment_4.superclasses;
import com.assignment_4.main.PersonalAccount;
import com.assignment_4.main.SavingAccount;
import com.assignment_4.subclasses.BankAccount;

public class Main {
	public static void main(String[] args){
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
		
	}

}
