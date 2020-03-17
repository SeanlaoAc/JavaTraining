package oop;


class Person{
	String name;
	String email;
	String phone;
	
	void walk(){
		System.out.println(name + " is walking");
	}
	void email() {
		System.out.println(email + " is email");
		
	}
	void phone() {
		System.out.println(phone + " Phone");
	}
}


public class demo {

	public static void main(String[] args) {
	
		Person person1 = new Person();
		person1.name = "Joe";
		person1.email = "joetestemail.com";
		person1.phone = "3283905503";
		
		person1.walk();
		person1.email();
		person1.phone();
		
		
		
		
		
		
		
		
		/*	// person
		String name = "Joe";
		String email = "Joe@testemail.com";
		String phone = "7849559632";
		
		System.out.println(name + " is eating");
		
		String name2 = "Holo";
		String email2 = "HOLO@testemail.com";
		String phone2 = "7849559632";
		System.out.println(name2 + " is eating");
	}
*/
	}
}
