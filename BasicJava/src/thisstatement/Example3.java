package thisstatement;
class A2 {
	A2() {
		this(5);
		System.out.println("hello a");
	}
	A2(int x) {
		System.out.println(x);
	}
}
public class Example3 {
	public static void main(String args[]) {
			A2 a = new A2();
	}

}
