package polymorfisum;

public class Static {
	static void print(int a) {
		System.out.println("print integer-->" + (a));
	}

	static void print(int a, String b) {
		System.out.println("print name and age-->" + (a) + (b));
	}

	public static void main(String[] args) {
		Static s = new Static();
		s.print(21);
		s.print(21, "vaishnavi");
	}

}
