package inhertiance;

public class Car extends Vehical {
void drive() {
System.out.println("the BMW drive");
}
public static void main(String[] args) {
	Car c=new Car();
	c.drive();
	c.start();
}
}
