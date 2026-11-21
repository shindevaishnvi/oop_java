package inhertiance;

public class C1 extends B1{
int z=86;
	void numbers() {
		System.out.println(z);
	}
	public static void main(String[] args) {
		C1 c=new C1();
		c.num();
		c.numb();
		c.numbers();
	}
}
