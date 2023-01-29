package methods;

public class Example11 {

	
		static int salary;
		int empId;	
		void display() {
			System.out.println("I am display()...");
		}
		static void print() {
			System.out.println("I am print()...");
		}
		public static void main(String[] args) {
			//access static members---> static variable and method
			System.out.println("static variable salary: "+Example11.salary);
			Example11.print();		
			//access non static members---> non-static variable and method
			Example11 m1=new Example11();
			System.out.println("non-static variable empId: "+m1.empId);
			m1.display();		
			//update static member
			Example11.salary=25000;
			System.out.println("update static variable salary: "+Example11.salary);
			//update non-static member
			m1.empId=205;
			System.out.println("update non-static variable empId: "+m1.empId);		
			Example11 m2=new Example11();
			System.out.println("2nd instance non-static variable empId: "+m2.empId);
			m2.display();

	}

}
