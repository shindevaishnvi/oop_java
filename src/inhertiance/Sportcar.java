package inhertiance;

public class Sportcar extends Cars {
void sportcars() {
	System.out.println("this is the sport car section");
}
public static void main(String[] args) {
	Sportcar s=new Sportcar();
	s.vehicals();
	s.cars();
	s.sportcars();
}
}
