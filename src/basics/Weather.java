package basics;

public class Weather {
	public static void main(String[]args) {
		// will give suggestions based on the temperature
		int temperature = 61;
		String SunCondition = "Sunny";
		
		if (temperature > 80) {
			System.out.println("It's pleasant. wear shorts and t-shirt");
			
		}
		else if ((temperature > 60) && (SunCondition == "Sunny")) {
			System.out.println("It's a litter cooler. perhaps wear a long sleeve shirt and jeans");
			System.out.println("Wear a hat to block the sun");
		}
		else if ((temperature > 50) || (SunCondition == "Overcast")) {
			System.out.println ("This is a cool day, make sure to wear warm clothes");
		}
		else {
			System.out.println("It's a cold day. bring a sweater");
		}
	}
}
