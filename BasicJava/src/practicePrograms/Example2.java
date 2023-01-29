package practicePrograms;

public class Example2 {

	public static void main(String[] args) {
		multipyTwoNumbers(10.1f,2.2f);
		Example2 mtn=new Example2();
		System.out.println("Result is : "+mtn.multiplyTwoNumber(1.2f,1.3f));
	}
static void multipyTwoNumbers(float a, float b) {
	double Result=a*b;
	System.out.println("Number 1 is "+a);
	System.out.println("Number 2 is "+b);
	System.out.println("Result for Multiplication is "+Result);
}
double multiplyTwoNumber(float num1, float num2) {
	double result=num1*num2;
	System.out.println("NUM 1 "+num1);
	System.out.println("NUM 2 "+num2);
	return result;
}
}
