package constructors;

public class Example3 {
	int roll;
	double salary;

	void display() {
		System.out.println(roll + "   " + salary);
	}

	public static void main(String args[]) {
		Example3 c1 = new Example3();
		c1.display();
	}
}