package basics;

public class NumbersCalc {
	public static void main(String[] args) {
		System.out.println("Program is starting");
		int numA = 15;
		int numB = 25;
		addNumbers(numA,numB);
		printName();
		int product = multipleNumbers (numA, numB);
		//System.out.println("The product of numbers " + numA + " and " + numB + " is " + multipleNumbers(numA,numB));
		System.out.println("The product of numbers " + numA + " and " + numB + " is " + product);
	}
	static void printName() {
		System.out.println("My name is Tim");
	}
	
	static void addNumbers(int numberA, int numberB) {
		//this function will add two numbers
		int sum = numberA + numberB;
		System.out.println("The sum of "+ numberA + " and " + numberB + 	" is "+ sum);
	}
	
	static int multipleNumbers(int valueA,int valueB) {
		int product	 = valueA * valueB;
		addNumbers(product + 50,product);
		return product;
	}
}
