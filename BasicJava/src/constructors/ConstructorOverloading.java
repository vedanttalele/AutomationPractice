package constructors;

public class ConstructorOverloading {
	ConstructorOverloading() {
		System.out.println("This is a zero-para constructor");
	}
	public ConstructorOverloading(char c) {
		System.out.println("This is a single-para constructor");
	}
	ConstructorOverloading(int num1, int num2) {
		System.out.println("This is a int-int parameterized constructor");
	}
	ConstructorOverloading(double num1, int num2) {
		System.out.println("This is a double-int parameterized constructor");
	}
	ConstructorOverloading(int num1, double num2) {
		System.out.println("This is a int-double parameterized constructor");
	}
	public static void main(String[] args) {
		ConstructorOverloading c1 = new ConstructorOverloading();
		ConstructorOverloading c2 = new ConstructorOverloading(10, 20);
		ConstructorOverloading c3 = new ConstructorOverloading('d');
		ConstructorOverloading c4 = new ConstructorOverloading(10d, 20);
		ConstructorOverloading c5 = new ConstructorOverloading(10, 20.45);	

}
}
/**
 * Constructor Overloading: more than on constructor in a class 
 * Rule: 1. type of args differ or 
 * 		 2. number of args differ or 
 * 		 3. position of args differ
 * 
 */