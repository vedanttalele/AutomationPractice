package practiceProgramsWhileLoop;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Armstrongnumber(408);
		int num=153,Rem,Armstrong=0;
		int orgnum=num;
		while(num>0) {
			Rem=num%10;
			num=num/10;
			Armstrong=Armstrong+Rem*Rem*Rem;
			
		}
		if(Armstrong==orgnum) {
			System.out.println(orgnum+ " is a Armstrong Number");
		}else {
			System.out.println(orgnum+ " is not a Armstrong number");
		}
	}
	static void Armstrongnumber(int num) {
		int rem,Armstrong=0,Orgnum=num;
		while(num>0) {
			rem=num%10;
			num=num/10;
			Armstrong=Armstrong+rem*rem*rem;
		}
		if(Armstrong==Orgnum) {
			System.out.println(Orgnum+ " is a armstrong Number");
		}else {
			System.out.println(Orgnum+ " is not a Armstrong Number");
		}
	}

}
