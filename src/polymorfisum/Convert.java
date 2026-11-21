package polymorfisum;

public class Convert {
void convert(double Celsius) {
	System.out.println("Celsius to Fahrenheit-->"+((Celsius*9/5)+32));
}
void convert(double Fahrenheit,int a) {
	System.out.println("Fahrenheit to Celsius-->"+((Fahrenheit-32)*5/9));
}
public static void main(String[] args) {
	Convert c=new Convert();
	c.convert(34);
	c.convert(45,0);
	
	
}
}
