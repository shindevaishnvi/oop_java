package polymorfisum;

public class Demo {

	void show (int a,String b) {
		System.out.println("the age is -->"+(a));
		System.out.println("the name is-->"+(b));
	}

	void show (String a,int b) {
		System.out.println("the name is -->"+(a));
		System.out.println("the age is-->"+(b));
	}
	public static void main(String[] args) {
		Demo d=new Demo();
		d.show(22, "vaishnavi");
		d.show("jeevan", 26);
	}
}
