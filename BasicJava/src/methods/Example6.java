package methods;

public class Example6 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		
		averageOfNumbers();
		averageOfNumbers(10, 20, 30);
    	averageOfNumbers(20, 30, 50);
		int age=25;
		System.out.println("Age "+age);
		//System.out.println(averageOfNumbers());//compile time erro
		/**
		 * When a method as return type as void, it won;t return any value to JVM
		 * and if you will try to print it, it will give you compile time error
		 */
		averageOfNumbers(25, 35, 45);// it will execute the method body but you won;t be able to get its return value
                                           //if return value is not given (return result);		
		System.out.println("************************************");
		//it will execute method body and print the return value in the console
		System.out.println("Average of 3 numbers is: "+averageOfNumbers(20, 30, 10)); // Same Ans as result
		System.out.println("***********************************");
		int avg=averageOfNumbers(40, 60, 20);//it will execute method body and stores return value into a variable for future use
		System.out.println("Average is: "+avg);  //same ans as result
		int finalNumber=120+avg;
		System.out.println("New number is: "+finalNumber);
		System.out.println("Program Ends");

	}
		public static void averageOfNumbers() {
			int num1= 15,num2= 25,num3= 35;
			int result= (num1+num2+num3)/3;
			System.out.println(num1);
			System.out.println(num2);
			System.out.println(num3);
			System.out.println(result);
		}
		public static int averageOfNumbers(int num1, int num2, int num3) {
		int result= (num1+num2+num3)/3;	
		System.out.println("N1 "+num1);
		System.out.println("N2 "+num2);
		System.out.println("N3 "+num3);
		System.out.println("Result "+result);
		return result;
		}
}
