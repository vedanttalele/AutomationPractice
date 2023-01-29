package practiceProgramsWhileLoop;

public class ReverseNumber {

	public static void main(String[] args) {
		System.out.println("Reverse No.: "+reverseNumber(124578,0));
		int Num=1243,Rn=0;
		while(Num!=0) {
			int digit=Num%10;	
			Rn=Rn*10+digit;	
			Num=Num/10;
		}
		
		System.out.println("Reverse Number is: "+Rn);
	}
	static int  reverseNumber(int num,int rn) {
	while(num!=0) {
		int digit=num%10;
		rn=rn*10+digit;
		num=num/10;
	}
	return rn;
	
}
	

}
