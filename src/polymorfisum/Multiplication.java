package polymorfisum;

public class Multiplication {
void multiply (int a,int b) {
	System.out.println(a*b);
}
void multiply(int x,int y,int z) {
	System.out.println(x*y*z);
}
public static void main(String[] args) {
	Multiplication m=new Multiplication();
	m.multiply(24, 46);
	m.multiply(24, 46, 46);
}
}
