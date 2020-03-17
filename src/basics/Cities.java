package basics;

public class Cities {

	public static void main(String[] args) {
		//decalre n define array
		String[] cities = {"New York", "San Francisco", "Miami", "Dallas"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		System.out.println("********");
		
		//declare & define array (only size)
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "Texas";
		states[3] = "New Jersey";
		states[4] = "Utah";
		int i = 0;
		//Do loop : enters loop then Tests conditions
		do {
		System.out.println("State: " + states[i]);
		i = i + 1;
		} while (i < 5);
		
		//while loop: tests conditions firsts then enters loop
		int n= 0;
		boolean stateFound = false;
		while (!stateFound) {
			String state = states[n];
			System.out.println(state);
			if  (state == "Texas") {
				System.out.println("STATE FOUND!");
				stateFound = true;
			}
			n++; // shortcut to i = i+ 1
		}
		System.out.println("\n*******ni********");
		//for loop : best structure for iterating through an array
		for (int x = 0; x < 5;x++) {
			System.out.println(states[x]);
		}
			
		}
		
	}


