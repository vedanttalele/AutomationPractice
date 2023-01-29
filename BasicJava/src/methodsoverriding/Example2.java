package methodsoverriding;

class ABC {
	public void myMethod() {
		System.out.println("method of ABC class");
	}
}
class Example2 extends ABC {
	public void myMethod() {
		// This will call the myMethod() of parent class
		super.myMethod();
		System.out.println("Overriding method of Class Overriding4");
	}
	public static void main(String args[]) {
		Example2 obj = new Example2();
		obj.myMethod();
	}
}