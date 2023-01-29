package abstraction;
interface Printable1 {
	void print();
}
interface Showable1 {
	void print();
}
class InterfaceExample2 implements Printable1, Showable1 {
	public void print() {
		System.out.println("Hello");
	}
	public static void main(String args[]) {
		InterfaceExample2 obj = new InterfaceExample2();
		obj.print();
		Showable1 obj1 = new InterfaceExample2();
		obj1.print();
		Printable1 obj2 = new InterfaceExample2();
		obj2.print();
	}
}