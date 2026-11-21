package polymorfisum;

public class Info {

	void details(String a) {
		System.out.println("print NAME-->" + (a));
	}

	void details(int a, String b) {
		System.out.println("print name and age-->" + (a) + (b));
	}

	public static void main(String[] args) {
		Info i=new Info();
		i.details("vaishnavi");
		i.details(21, "vaishnavi");
	}
}
