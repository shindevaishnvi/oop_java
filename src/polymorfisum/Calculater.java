package polymorfisum;

public class Calculater {
 void add(int a,int b) {
	System.out.println(a+b);
 
 }
 void add(int x ,int y ,int z) {
	 System.out.println(x+y+z);
 }
public static void main(String[] args) {
	Calculater c=new Calculater();
	c.add(12, 54);
	c.add(42, 46, 38);
}
}
