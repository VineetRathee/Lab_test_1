package com.bankApp;

public class CurrentAccount extends Account {

	private float minimumBalance=1000;

	public CurrentAccount() {
	}

	public CurrentAccount(Owner owner, float balance, String number) {
		super( owner, balance, number);
	}

	public float getMinimumBalance() {
		return minimumBalance;
	}

	@Override
	public void print() {
		System.out.println("Name of Owner: "+getOwner());
		System.out.println("Available Balance: "+getBalance());
		System.out.println("Number: "+getNumber());
		System.out.println("Minimum Balance: "+getMinimumBalance());
	}

	@Override
	public void withdraw(float amount) {

		float balance = getBalance() - amount;
		if (balance > minimumBalance) {
			setBalance(balance);
			System.out.println("Amount is withdrawl");
		} else {
			System.out.println("Try again!");
		}
	}

	@Override
	public void deposit(float amount) {
		setBalance(getBalance()+amount);		
	}
	
	public float getCharges() {
		return (float)(minimumBalance*0.2);
	}


}
