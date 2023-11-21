package com.example.demo;

public class BankAccount {
	
	private double balance;
	
	public BankAccount(double initialBalance) {
		 if (initialBalance < 0) {
	            throw new IllegalArgumentException("Initial balance cannot be negative.");
	        }
		this.balance=initialBalance; 
	}
	
	   public void withdraw(double amount) throws InsufficientFundsException {
	        if (amount > balance) {
	            throw new InsufficientFundsException();
	        }

	        balance -= amount;
	    }

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	  
	
	

}
