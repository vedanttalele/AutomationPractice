package practiceProgramsWhileLoop;

public class PalindromeNumber {

	public static void main(String[] args) {
		checkPalindromeNumber(52525,0);
		int num=1232,revnum=0,Rem;
		int orgnum=num;
		while(num!=0) {
			Rem=num%10;
			revnum=revnum*10+Rem;
			num=num/10;
		}
		if(orgnum==revnum) {
		System.out.println(orgnum+" is a palindrome Number");
		}else {
		System.out.println(+orgnum+" is not a Palindrome Number");
		}
	}
	static int checkPalindromeNumber(int num,int revnum) {
		int Orgnum=num;
		while(num!=0) {
			int rem=num%10;
			revnum=revnum*10+rem;
			num=num/10;
		}
		if(revnum==Orgnum) {
			System.out.println(revnum+" is a Palindrome Number");
		}else {
			System.out.println(revnum+ " is not a Palindrome Number");
		}
		return revnum;
	}
}
