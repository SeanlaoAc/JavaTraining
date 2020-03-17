package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		
		
		BankAccount acc1 = new BankAccount();
		acc1.accountNumber = "018340583";
		//acc1.name = "Roger Hue";
		acc1.setName("Roger Hue"); 
		System.out.println(acc1.getName());
		acc1.setSsn("34224242");
		System.out.println("SSN: " + acc1.getSsn());
		acc1.balance = 10000;
		acc1.setRate();
		acc1.increasRate();
		
		acc1.deposit(1500);
		//polymorphism through overriding
		System.out.println(acc1.toString());
		
		//polymorphism through overloading
		
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "018340583";	
		BankAccount acc3 = new BankAccount("Savings Account", 1001);
		acc3.accountNumber = "018340583";
		acc3.checkBalance(); 
		
		/*
		//Demo inheritance
		CDAccount cd1= new CDAccount();
		cd1.balance = 3000;
		cd1.interestRate = "4.5";
		cd1.name = "Juan";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		cd1.compunt();
		*/
	}

}
