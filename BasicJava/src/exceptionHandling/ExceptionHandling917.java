package exceptionHandling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling917 {
	// defining a method
	public int divideNum(int m, int n)
	{
		int div = m / n;
		return div;
	}

	// main method
	public static void main(String[] args) {
		ExceptionHandling917 obj = new ExceptionHandling917();
	//	System.out.println(obj.divideNum(45, 0));
		try {
			System.out.println(obj.divideNum(45, 0));
		} catch (ArithmeticException e) {
			System.out.println("\nNumber cannot be divided by 0");
		}
		System.out.println("Rest of the code..");
	}
}