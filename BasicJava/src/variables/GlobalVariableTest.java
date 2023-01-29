package variables;

public class GlobalVariableTest {
	static int empId=1005;   //StaticGV
	double salary=45000;     //NonStaticGV
	int pinCode;             //NonStaticGV
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Program Starts");
	int age=25;  //local variable
System.out.println("Local Variable age: "+age);

System.out.println("SGV empId is: "+empId);
System.out.println("!!!!!!!!!!!!!!!!!!!!");

GlobalVariableTest g1;
g1= new GlobalVariableTest();  //declared and initialized
System.out.println("NSGV Salary is: "+g1.salary);
g1.salary=65000.25;

g1.pinCode=425505;
System.out.println("NSGV PinCode is: "+g1.pinCode);
System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

empId=1001;
System.out.println("SGV EmpId is: "+empId);
GlobalVariableTest g2= new GlobalVariableTest ();
System.out.println("NSGV Salary is: "+g2.salary);
System.out.println("NSGV PinCode is: "+g2.pinCode);
System.out.println("Program Ends");
	}
}
