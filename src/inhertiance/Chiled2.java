package inhertiance;

public class Chiled2 extends Parentss {
	void childess() {
		System.out.println("chiled class 2");
	}

	public static void main(String[] args) {
		Chiled2 c = new Chiled2();
		c.p();
		c.childess();
		Chiled1 cc = new Chiled1();
		cc.p();
		cc.chileds();
	}
}
