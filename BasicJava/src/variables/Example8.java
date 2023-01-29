package variables;

public class Example8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Program Starts");
System.out.println("Program Starts");
int num1=10,num2=1;//error at compile time as/if num2/num1 is not initilize
int res = num1 +num2;
System.out.println("Result is: "+res);
System.out.println("Program Ends");
	}

}
/*
Variable declared inside the method body known as local variable.
These variables are accessible with in the method body.
These variable should be initiliaze before we use them.
These variable can't be declared as static.
*/