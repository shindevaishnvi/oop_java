package inhertiance;

public class CCC extends BBB {
	void showC() {
		System.out.println("show C");
	}
	public static void main(String[] args) {
		CCC c=new CCC();
	c.showA();
	c.showB();
	c.showC();
	}
}
