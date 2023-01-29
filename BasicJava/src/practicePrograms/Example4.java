package practicePrograms;

public class Example4 {

	public static void main(String[] args) {
		getQuotientANDRemainder(25,5);
	}
	static void getQuotientANDRemainder(int num1,int num2){
		int quo=num1/num2;
		int rem=num1%num2;
		System.out.println("Quotient is "+quo);
		System.out.println("Remainder is "+rem);
		
	}

}
