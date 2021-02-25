package com.bankApp;

public class BankApp {

	public static void main(String[] args) {
		
		Date date1= new Date(02,10,2004);
		Date date2= new Date(02,11,1999);
		
		Owner vineet = new Owner("vineet rathee",date1,"Acc012");
		Owner keshav = new Owner("keshav arora ",date2,"Acc013");
		
		
		Account account1 = new SavingAccount(vineet,1000,"20000");
		Account account2 = new CurrentAccount(keshav,10000,"3000");
		
		
		System.out.println("your balance" + account1.getBalance());
		System.out.println("Add 500");
		account1.deposit(500);
		System.out.println("Deposit succesffully");
		System.out.println(account1.getBalance());
		
		
		System.out.println("Withdraw 500");
		account1.withdraw(500);
		System.out.println(account1.getBalance());
		account1.withdraw(1200);
	}
}
