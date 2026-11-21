package polymorfisum;

public class Display {
void display(int a) {
	System.out.println("this is the integer value-->"+(a));
}
void display(String a){
	System.out.println("this is the string value-->"+(a));
}
public static void main(String[] args) {
	Display d=new Display();
	d.display(12);
	d.display("vaishnavi");
} 

}
