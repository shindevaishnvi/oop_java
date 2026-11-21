package polymorfisum;

public class Sum {
void sum(int a, int b) {
	System.out.println(a + b);
}
void sum(float a,float b) {
	System.out.println(a+b);
}
public static void main(String[] args) {
	Sum s=new Sum();
	s.sum(25, 57);
	s.sum(6473.9f, 8737.46f);
}
}
