package oop;

public class BankAccount implements IRate {

	
		//define variable
		String accountNumber;
		
		private static final String routingNumber="02409873403";
		// Instance Variables
		private String name;
		private String ssn;
		
		String accountType;
		double balance = 0;
		
		//constructor define unique method
		BankAccount(){
			System.out.println("NEW ACCOUNT CREATED");
		}
		//Overloading: call same method name with different arguments
		BankAccount(String accountType){
			System.out.println("New Account: " + accountType);
		}
		BankAccount(String accountType, double initDeposit){
			//initDeposit, accountType, Msg are all local variables
			System.out.println("New Account: " + accountType);
			System.out.println("Initial Deposit of: $" + initDeposit);
			String Msg = null;
			if (initDeposit < 1000) {
				
				Msg = "Error: Minimum Deposit must be at leat $1,000";
			
			}
			else {
				Msg= "thanks for your initial deposit of: $" + initDeposit;
			}
			System.out.println(Msg);
			balance =  initDeposit;
		}
		
		
		//getter setter
		
			public void setName(String name) {
				this.name = "Mr." + name;
			}
			public String getName() {
				return name;
			}
			
			public String getSsn() {
				return ssn;
			}
			public void setSsn(String ssn) {
				this.ssn = ssn;
			}
			
		//Interface Methods
			public void setRate() {
				System.out.println("Setting Rate");
			}
			public void increasRate() {
				System.out.println("Increasing Rate");
			}
		
		//Define methods
		public void deposit(double amount) {
			balance = balance + amount;
			showActivity("DEPOSIT");
				
		}
		public void withdraw(double amount) {
			balance = balance + amount;
			showActivity("WITHDRAW");
			
		}
		// private. can only be called within the class
		private void showActivity(String activity) {
			System.out.println("YOUR RECENT TRANSACTION: " + activity);
			System.out.println("YOUR NEW BALANCE: $" +balance);
		}
		void checkBalance() {
			System.out.println("Balance is "+ balance);
		}
		void getStatus() {
			
		}
		@Override
		public String toString() {
			return " [NAME: " + name + ". ACCOUNT# " + accountNumber + ".ROUTING #" + routingNumber + " Balance: $ " + balance + " ]";
				
		}
		

	}


