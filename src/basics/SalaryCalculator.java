package basics;

public class SalaryCalculator {
	public static void main(String[] args) {
		// create a variable to define our career
		// declare a variable
		String career;
		System.out.println("Program is starting...");
		
		//defined a variable
		career = "Software Developer";
		System.out.println("My career: " + career);
		
		//declare and define a variable
		int hoursPerweek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		career = "web developer";
		
		double salary = hoursPerweek * weeksPerYear * rate;
		System.out.println("My salary as a " + career + " at a rate of $" + rate + " is $" + salary + " per year");
		// computer annual salary
		// rate * hoursPerweek * weeksPerYear
	}

}
