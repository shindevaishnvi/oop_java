package polymorfisum;

public class Calculaters {
	void calculate(int a) {
		System.out.println(a*a);
	 
	 }
	 void  calculate(double x) {
		 System.out.println(x*x*x);
	 }
	public static void main(String[] args) {
		Calculaters c=new Calculaters();
		c.calculate(12);
		c.calculate(21);
		
	}
}
