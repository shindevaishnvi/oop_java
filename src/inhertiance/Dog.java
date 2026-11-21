package inhertiance;

public class Dog extends Animal{
void bark() {
	System.out.println("dog bark");
	
}
public static void main(String[] args) {
	Dog d=new Dog();
	d.bark();
	d.eat();
}
}
