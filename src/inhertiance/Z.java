package inhertiance;

public class Z extends Y{
int c=3;
	void display() {
	System.out.println(c);
}
	public static void main(String[] args) {
		Z z=new Z();
		z.display();
		z.num();
		z.number();
	}
}
