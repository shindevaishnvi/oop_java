package polymorfisum;

public class Area {
void area(double r ) {
	System.out.println("area of circle is -->"+(3.14*r*r));
}
void area(int l,int w) {
	System.out.println("area of reactangel is-->"+(l*w));
}
public static void main(String[] args) {
	Area a=new Area();
	a.area(5.5);
	a.area(67, 58);
}
}
