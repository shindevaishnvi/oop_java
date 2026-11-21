package inhertiance;

public class Dogs extends Animals {
void dog() {
	System.out.println("DOGS");
}
public static void main(String[] args) {
	Dogs d=new Dogs();
	d.livingthing();
	d.animal();
	d.dog();
}
}
