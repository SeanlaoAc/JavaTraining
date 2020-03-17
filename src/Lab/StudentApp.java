package Lab;

public class StudentApp {
	public static void main (String[] args) {
	StudentDB stu1 = new StudentDB("Jane","2323232321");
	StudentDB stu2 = new StudentDB("Stew","2322432211");
	StudentDB stu3 = new StudentDB("Paue","67834542121");
	
	stu1.enroll("Math151");
	stu1.enroll("Eng255");
	
	stu1.showCourses();
	stu1.checkBalance();
	stu1.payTuition(600);
	stu1.checkBalance();
	System.out.println(stu1.toString());
	
}
}

class StudentDB {
	
	private static int id = 1000;
	private String userId;
	private String name;
	private String email;
	private String phone;
	private String city;
	private String state;
	
	
	
	private String SSN;
	private String course = "";
	private static final int costofCourse = 800;
	private int balance;
	
	
	public StudentDB(String name, String SSN) {
		id++;
		this.name = name;
		this.SSN = SSN;
		setUserId();
		setEmail();
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	private void setEmail() {
		email = name.toLowerCase() + "."+ id +  "@sdetuniversity.com";
		System.out.println("Your email:" + email);
	}
	public String getEmail() {
		return email;
	}
	
	
	private void setUserId() {
		int max = 90;
		int min = 10;
		int randNUm =(int)( Math.random() * (max - min));
		
		randNUm = randNUm + min;
		userId = id + "" + randNUm + SSN.substring(6);
		System.out.println("Your User ID: " + userId);
		
		
	}
	
	public void enroll(String course) {
		this.course = this.course + "\n" + course;
		System.out.println(course);
		balance = balance + costofCourse;
	}
	public void payTuition(int amount) {
		System.out.println("Payment: " + amount);
		balance = balance - amount;
		
	}
	public void checkBalance() {
		System.out.println("Balance: $" + balance);
	}
	public void showCourses() {
		System.out.println(course);
	}
	public String toString() {
		return "[Name: " + name + "]\n[Courses : " + course + "]\n[Balance: " + balance + "]";
	}
	
}