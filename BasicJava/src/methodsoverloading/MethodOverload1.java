package methodsoverloading;

class MethodOverloadd {

	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}
}
	public class MethodOverload1 {
	public static void main(String[] args) {
		System.out.println(MethodOverloadd.add(11, 11));
		System.out.println(MethodOverloadd.add(11, 11, 11));
	}

}
