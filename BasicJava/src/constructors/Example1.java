package constructors;

public class Example1 {
	int age;
	public static void calling() {
		System.out.println("I am calling method..");
	}
	public static void main(String[] args) {
		Example1 e1 = new Example1();
		System.out.println(e1.age);
		e1.calling();
	}

}
