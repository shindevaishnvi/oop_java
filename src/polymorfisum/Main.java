//yes we can overload the main method and the example is as below 
//we can also overload static method
//we can also overload constractor

package polymorfisum;

public class Main {
	static void main(int a) {
		System.out.println("print integer-->" + (a));
	}

	static void main(int a, String b) {
		System.out.println("print name and age-->" + (a) + (b));
	}

	public static void main(String[] args) {
		Static s = new Static();
s.print(26);
s.print(26, "jeevan");
	}
}
