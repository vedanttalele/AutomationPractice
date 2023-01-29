package finalkeyword;

public class Example4 {
	int cube(final int n){ //final int n=5;
		System.out.println(n);//5
		  // n=n+2;//can't be changed as n is final  
		   return n*n*n;  
		  }

	public static void main(String args[]) {
		Example4 b = new Example4();
		System.out.println(b.cube(5));
	}
}