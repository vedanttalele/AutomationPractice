package operators;

public class LogicalOperators2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Program Starts");
//Variables Declaration and Initialization
		int num1=20,num2=30;
		boolean bool1=(num1==num2);//=false
		boolean bool2=(num1>num2); //=false
		
// Logical AND
System.out.println("bool1 && bool2 = " + (bool1 && bool2));

//Logical OR
System.out.println("bool1 || bool2 = " + (bool1 || bool2));

//Logical Not
System.out.println("!(bool1 && bool2) = " + !(bool1 && bool2));
System.out.println("Program Ends");
	}

}