package constructors;

public class Example2 {

	int age;
	double salary;
	char c_var;
	/**
	 *  below is default constructor, that will be written by java compiler at compile time
	  Example2(){
			//empty body
		}
	*/

	public static void main(String[] args) {

		Example2 c1 = new Example2();
		System.out.println(c1.age);// 0
		System.out.println(c1.salary);// 0.0
		System.out.println(c1.c_var);
	}
}