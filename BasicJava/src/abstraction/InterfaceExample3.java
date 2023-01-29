package abstraction;
interface Printable2 {
	void print();
}
interface Showable2 extends Printable2 {
	void show();
	//public abstract void print(); ---> inherited method
}
class InterfaceExample3 implements Showable2 {
	public void print() {
		System.out.println("Hello");
	}
	public void show() {
		System.out.println("Welcome");
	}
	public static void main(String args[]) {
		InterfaceExample3 obj = new InterfaceExample3();
		obj.print();
		obj.show();
		Printable2 obj2 = new InterfaceExample3();
		obj2.print();
		//obj2.show();
		System.out.println("***************");
		Showable2 obj3 = new InterfaceExample3();
		obj3.print();
		obj3.show();
	}
}