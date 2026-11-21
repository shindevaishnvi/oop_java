package inhertiance;

public class Chileds extends Parents {
int c=3;
void number() {
	System.out.println(c);
}
public static void main(String[] args) {
	Chileds c=new Chileds();
	c.num();
	c.numb();
	c.number();
}
}
