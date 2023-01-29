package methodsoverloading;

public class MethodOverloadTotalRecall {
	//global variables --->
		static int age1;
		static double salary1 = 2536.0326;
		int age2;
		double salary2 = 568.898;
		// method--->
		void display() {
			System.out.println("Hello I am display()");
		}
		double getInterest(int amount, int numOfYrs, double irt) {
			System.out.println("Hello I am getInterest(int,int,double)");
			return 253.5465;
		}
		static void display2() {
			System.out.println("Hello, I am display2()");
		}
		static double getInterest2(int amount, int numOfYrs, double irt) {
			System.out.println("Hello I am getInterest2(int,int,double)");
			return 253.5465;
		}
		//try to implement method overloading also
		
	public static void main(String[] args) {
		//access static members
		System.out.println("Age1 is: "+age1);
        System.out.println("Salary1 is: "+salary1);
        display2();
        getInterest2(100000,6,7);
		 		//access non-static members
        MethodOverloadTotalRecall motr = new MethodOverloadTotalRecall();
        System.out.println("Age2 is: "+motr.age2);
        System.out.println("Salary2 is: "+motr.salary2);
        motr.display();
        motr.getInterest(50000,3,6);
	}

}
