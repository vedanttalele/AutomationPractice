package abstraction;
interface Printable {
	int age=30;//by default public static final
	void print();
}
interface Showable {
	public void show();
}
public class InterfaceExample1 implements Printable, Showable {
	public static int age=45;
	public void print() {
		System.out.println("Hello, print");
	}
	public void show() {
		System.out.println("Welcome, show");
	}
	public static void main(String args[]) {
		InterfaceExample1 obj = new InterfaceExample1();
		obj.print();
		obj.show();
		System.out.println(Printable.age);
		System.out.println(InterfaceExample1.age);
	}
}