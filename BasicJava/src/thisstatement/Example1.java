package thisstatement;
class A1 {
	A1() {	
		this(25.5);
		System.out.println("hello zero");
	}
	A1(double d) {
		this(10);
		System.out.println("hello double " + d);
	}
	A1(int x) {
		System.out.println("Hello int " + x);
	}
}
public class Example1 {

	public static void main(String[] args) {
//		 A1 a1=new A1();
//		 A1 a2=new A1(10);
//		 A1 a3=new A1(10.23);
			//or
		A1 a1 = new A1();
	}
}
/**
* this()---> statement
* this(): used to call another constructor of current class based on its argument
* this(): should be the first statement inside the constructor body
*/
	


