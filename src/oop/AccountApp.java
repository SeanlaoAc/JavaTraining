package oop;

public class AccountApp {

	public static void main(String[] args) {
		loanAccount la = new loanAccount();
		la.increasRate();
		la.setRate();
		la.setAmmortSchedule();
		la.setTerm(20);
		
		//polymorphism changers where we are pointing
		IRate account1 = new loanAccount();
		account1.increasRate();
		account1.setRate();

	}

}
