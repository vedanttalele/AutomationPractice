package operators;

public class RelationalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Program Starts");
// Variables Declaration and Initialization
int num1 = -12, num2 = -4;
System.out.println("num1: " + num1 + "\tnum2: " + num2);
//is equal to
//boolean res = (num1 == num2);               // declared and initialized variables and print directly
//System.out.println("num1 == num2 = " + res);// 
		//or
System.out.println("num1 == num2 = " + (num1 == num2));

//is not equal to
System.out.println("num1 != num2 = " +(num1 != num2));

//Greater than
System.out.println("num1 > num2 = " +(num1 > num2));

//Less than
System.out.println("num1 < num2 = " +(num1 < num2));

//Greater than or equal to
System.out.println("num1 >= num2 = " +(num1 >= num2));

// Less than or equal to
System.out.println("num1 <= num2 = " +(num1 <= num2));
System.out.println("Program Ends");
	}

}