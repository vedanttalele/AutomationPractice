package practiceProgramsIfElse;

public class FindLargestNumber {

	public static void main(String[] args) {
		findLargestNumber(22,56,87);
		int num1=100,num2=100,num3=100;
		if(num1>num2&&num1>num3) {
			System.out.println("Largest Number is "+num1);
		}else if(num2>num1&&num2>num3) {
			System.out.println("Largest Number is "+num2);
		}else if(num3>num1&&num3>num2) {
			System.out.println("Largets Number is "+num3);
		}else {
			System.out.println("ALL ARE SAME");
		}
	}
	static void findLargestNumber(int a,int b,int c) {
		if(a>b&&a>c) {
			System.out.println("Largest Number is "+a);
		}else if(b>a&&b>c) {
			System.out.println("Largest Number is "+b);
		}else if(c>a&&c>b) {
			System.out.println("Largets Number is "+c);
		}else {
			System.out.println("ALL ARE SAME");
		}
	}

}
