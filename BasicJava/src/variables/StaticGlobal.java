package variables;

public class StaticGlobal {
	//Static  Global Variable Example
	static int empId=1001;
	static double salary;//declared but not initialized
	public static void main(String[] args) {
		System.out.println("Program Starts");
		int age=25; //local Variable
		System.out.println("Local Variable Age is "+age);
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println("SGV EmpId is "+empId);   //accessing global variable directly
		System.out.println("SGV Salary is "+salary);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("SGV EmpId is "+StaticGlobal.empId);    //accessing global variable with standard
		System.out.println("SGV Salary is "+StaticGlobal.salary);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		salary=25000;// declared then, now initialized
		System.out.println("SGV Salary is "+salary);
		System.out.println("Program Ends");
	}

}
