package practicePrograms;

public class Example1 {

	public static void main(String[] args) {
     addTwoNumbers(10,20);
     System.out.println("Result of Return Type is "+addTwoNumber(12,21));
	}
static void addTwoNumbers(int num1,int num2) {
	int res=num1+num2;
	System.out.println("num1 "+num1);
	System.out.println("Num2 "+num2);
	System.out.println("Result is "+res);
}
static int addTwoNumber(int a,int b) {
	int result = a+b;
	System.out.println("NUmber A is "+a);
	System.out.println("NUmber A is "+b);
	return result;
}
}
