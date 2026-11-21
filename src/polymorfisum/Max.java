package polymorfisum;

public class Max {
void max(int a,int b) {
	System.out.println(Math.max(a, b));
}
void max(int x,int y,int z) {
	System.out.println(Math.max(x, Math.max(y, z))); 
	
}
public static void main(String[] args) {
	Max m=new Max();
	m.max(35,75);
	m.max(24, 36, 37);
	
}
}
