package practicePrograms;

public class Example5 {

	public static void main(String[] args) {
		swapTwoNumbers(10,20);
	}
static void swapTwoNumbers(int a,int b) {
	int res=a+b;
	int tempA=res-a;
	int tempB=res-b;
	System.out.println("Swap Num 1 is "+tempA);
	System.out.println("Swap Num 2 is "+tempB);
	
}
}
