package practiceProgramsIfElse;

public class CheckEvenOdd {

	public static void main(String[] args) {
		CheckEvenOdds(121);
		checkEvenOdd(4);
		int num=12112;
		if(num%2==0) {
			System.out.println("Number is Even");
		}else {
			System.out.println("Number is Odd");
		}
		
	}
	static void CheckEvenOdds(int num) {
		if(num%2==0) {
			System.out.println("Even Number");
		}else {
			System.out.println("Odd Number");
		}
	
	}
	static boolean checkEvenOdd(int num1) {
		if(num1%2==0) {
			System.out.println("Even Number");
			return true;
		}else {
			System.out.println("Odd Number");
			return false;
		}
	}

}
