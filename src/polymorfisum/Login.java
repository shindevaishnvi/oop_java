package polymorfisum;

public class Login {
	void details(String a) {
		System.out.println("username-->" + (a));
	}

	void details(String a,String b) {
		System.out.println("print username  and password-->" + (a) + (b));
	}

	public static void main(String[] args) {
		Login l=new Login();
		l.details("vaishnavi");
		l.details("vaishnavi", "vaishnavi@123");
	}
}
