package thiskeyword;

public class Example3 {
	int x;
	// Constructor with a parameter
	public Example3(int x) {
		this.x = x;
	}

	// Call the constructor
	public static void main(String[] args) {
		Example3 myObj = new Example3(5);
		System.out.println("Value of x = " + myObj.x);
	}
}