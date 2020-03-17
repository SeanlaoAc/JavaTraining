package Lab;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1= new BankAccount("3409374504", 1000);
		BankAccount acc2= new BankAccount("3409374504", 2400);
		BankAccount acc3= new BankAccount("3409374504", 2343);
		
		acc1.setName("jim");
		System.out.println(acc1.getName());
		acc1.makeDeposit(500);
		acc1.makeDeposit(233);
		acc1.payBill(1000);
		acc1.accrue();
		System.out.println(acc1.toString());

	}
}
	
	class BankAccount implements IInterest{
		//properties
		private static int id = 1000;							//Internal ID
		private String accountNumber; //id + 2 random digit number + first 2 SSN
		private static final String routingNumber = "0054212";
		private String name;
		private String SSN;
		double balance;
		
		
	//constructor
		public BankAccount(String SSN, double initDeposit) {
			balance = initDeposit;
			System.out.println("NEW ACCOUNT CREATED");
			this.SSN = SSN;
			id++;
			System.out.println(id);
			setAccountNumber();
		}
		
		private void setAccountNumber() {
			int random = (int) (Math.random() * 100);
			
			accountNumber = id + "" + random + SSN.substring(0,2);
			System.out.println("Your account number: " + accountNumber);
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}
		public void payBill(double amount) {
			 balance = balance-amount;
			 System.out.println("Paying bill: " + amount);
			 showBalance();
		}
		public void makeDeposit(double amount) {
			balance = balance+amount;
			System.out.println("Making deposit: " + amount);
			showBalance();
		}
		public void showBalance() {
			System.out.println("Balance: " + balance);
		}

		@Override
		public void accrue() {
			balance = balance * (1+rate/100);
			showBalance();
			
		}
		@Override
		public String toString() {
			return "[Name: " + name + " ]\n[Account Number: " + accountNumber + "]\n" + "[Routing Number: "  + routingNumber + "]\n" +
		"[Balance " + balance + "]";
				
		}
		
	}


