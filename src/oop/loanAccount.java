package oop;

public class loanAccount implements IRate{

	@Override
	public void setRate() {
		System.out.println("Rate");
		
	}

	@Override
	public void increasRate() {
		System.out.println("Increase Rate");
		
	}
	
	public void setTerm(int term) {
		System.out.print("Setting the term to:" + term + " years ");
	}
	public void setAmmortSchedule() {
		System.out.print("Amortization schedule");
	}
	

}
