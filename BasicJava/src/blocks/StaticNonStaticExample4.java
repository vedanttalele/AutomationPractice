package blocks;

public class StaticNonStaticExample4 {
	final static int age;
	final double salary;	
	StaticNonStaticExample4(){
		System.out.println("I am StaticNonStaticExample4 class cons...");
	}
	void print() {
		System.out.println("age: " + age);
		System.out.println("salary: " + salary);
	}
	public static void main(String[] args) {
		System.out.println("main() Starts..");
		StaticNonStaticExample4 b1 = new StaticNonStaticExample4();
		System.out.println("main() ends..");
	}
	/* non-static block or IIB */
	{
		salary = 45000.32;
		print();
	}
	static {
		age =25;
	}
}