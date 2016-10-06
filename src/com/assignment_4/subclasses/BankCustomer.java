package com.assignment_4.subclasses;
import com.assignment_4.superclasses.*;
import java.util.ArrayList;

import com.assignment_4.superclasses.BankAccount;
import com.assignment_4.superclasses.Human;

public class BankCustomer extends Human{
	
	private ArrayList<BankAccount> customerAccounts = new 
			ArrayList<BankAccount>();
		
	public BankCustomer(String name, int age) {
		super(name, age);
	}
	public ArrayList<BankAccount> getCustomerAccounts(){
		return customerAccounts;
	}
	public void setCustomerAccounts(ArrayList<BankAccount> customerAccounts) {
		this.customerAccounts = customerAccounts;
	}
	public void addAccount(BankAccount bankAccount){
		customerAccounts.add(bankAccount);
	}
	public void depositToAccount(String accountName, double amount){
		for (int i = 0; i < customerAccounts.size(); i++){
			if(customerAccounts.get(i).getAccountNumber().equals(accountName)){
				customerAccounts.get(i).depositMoney(amount);
			}
		}
	}
	public void withdrawMoneyFromAccount(String accountName, double amount){
		for (int i = 0; i < customerAccounts.size(); i++){
			if(customerAccounts.get(i).getAccountNumber().equals(accountName)){
				customerAccounts.get(i).withdrawMoney(amount);
			}
		}
	}
	
    public String toString() {
        String result = "Customer: "+getName()+", Age: "+getAge()+"\n";
        for (int i = 0; i < customerAccounts.size(); i++) {
            result = result + customerAccounts.get(i).toString()+"\n";
        }
        return result;
       
    }	 
			
	
		
				
	
	

}
