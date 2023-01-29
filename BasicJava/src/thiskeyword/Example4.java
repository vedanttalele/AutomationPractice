package thiskeyword;
class A {
	void m() {
		System.out.println("hello m");
	}
	void n() {
		System.out.println("hello n");
		//m();//or
		this.m();
	}
}
public class Example4 {

	void methodOne() {
		System.out.println("Inside Method ONE");
	}
	void methodTwo() {
		System.out.println("Inside Method TWO");
		//methodOne();//or 
		this.methodOne();
	}
	public static void main(String[] args) {
		Example4 obj = new Example4();
		obj.methodTwo();
		A a = new A();
		a.n();
	}
}
	


