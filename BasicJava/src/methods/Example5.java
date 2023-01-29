package methods;

public class Example5 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		averageOfNumbers();
		averageOfNumbers(10, 20, 30);
		averageOfNumbers(20, 30, 50);
		int age=25;
		System.out.println(age);
		System.out.println("Program Ends");
		
		//System.out.println(averageOfNumbers());
		/**
		 * When a method as return type as void, it won;t return any value to JVM
		 * and if you will try to print it, it will give you compile time error
		 * 
		 */
	}
	static void averageOfNumbers() {
		int num1=10, num2=20, num3=30;
		int res=(num1+num2+num3)/3;
		System.out.println("Number1 is: "+num1);
		System.out.println("Number2 is: "+num2);
		System.out.println("Number3 is: "+num3);
		System.out.println("Result is: "+res);
	}
	
	static void averageOfNumbers(int num1,int num2,int num3) {
		int res=(num1+num2+num3)/3;
		System.out.println("Number1 is: "+num1);
		System.out.println("Number2 is: "+num2);
		System.out.println("Number3 is: "+num3);
		System.out.println("Result is: "+res);
	}
	

}
