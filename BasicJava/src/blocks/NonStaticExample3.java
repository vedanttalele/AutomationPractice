package blocks;

public class NonStaticExample3 {

	int age = 25;
	double salary = 15000.57;
	void print() {
		System.out.println("age: " + age);
		System.out.println("salary: " + salary);
	}
	public static void main(String[] args) {
		System.out.println("main() Starts..");
		NonStaticExample3 b1 = new NonStaticExample3();
		System.out.println("main() ends..");
	}
	/* non-static block or IIB */
	{
		salary = 45000.32;
		print();
	}
}