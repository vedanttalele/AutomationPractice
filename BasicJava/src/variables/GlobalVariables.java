package variables;

public class GlobalVariables {
	//global variable
	static int empId=1001; //static global variable
	int salary=25000;  //non static global variable
	
	public static void main(String[] args) {
	System.out.println("Program Starts");
	int age=25;   //local variable
	System.out.println("Age is "+age);
    System.out.println("Program Ends");
	}
}
