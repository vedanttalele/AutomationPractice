package finalkeyword;

public class Example2 {
	final int empId=90;
	double salary=34400.67;
	void run() {
		System.out.println("empId: "+empId);
	}
	public static void main(String args[]) {
		Example2 obj = new Example2();
		obj.run();
		System.out.println(obj.salary);
	}
}