package methods;

public class Example4 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
				
			getAverage();
			getAverage();
			getAverage();
			getAverage(25, 30, 25);
			getAverage(10, 30, 20);
			getAverage(50, 150, 50);
			System.out.println("Program Ends");
		}
		static void getAverage(int a,int b,int c) {
			int avg;
			avg=(a+b+c)/3;
			System.out.println("Num1: "+a);
			System.out.println("Num2: "+b);
			System.out.println("Num3: "+c);
			System.out.println("Avg: "+avg);
			//Adv: no need write same code again and again and you will be able to use any number for addition
		}
		public static void getAverage() {
			int a=10,b=20,c=30,avg;
			avg=(a+b+c)/3;
			System.out.println("Num1: "+a);
			System.out.println("Num2: "+b);
			System.out.println("Num3: "+c);
			System.out.println("Avg: "+avg);
			
		}
		/*
		 * Adv: no need write same code again and again
		 * DisAdv: you won;t be able to change the value of variables
		 */
	}


