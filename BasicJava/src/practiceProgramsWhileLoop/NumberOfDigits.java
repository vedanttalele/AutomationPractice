package practiceProgramsWhileLoop;

public class NumberOfDigits {

	public static void main(String[] args) {
		System.out.println("NUM OF DIGITS ARE: "+numberOfDigits(1474548,0));
		int num=1245;
		int noc=0;
		while(num!=0) {
			num=num/10;
			noc++;
		}
		System.out.println("Number Of Digits Are: "+noc);
	}
	static int numberOfDigits(int num,int noc) {
		while(num!=0) {
			num=num/10;
			noc++;
		}
		
		return noc;
	}
}
/*
noc=0;
1245/10=124(num);noc=1;
124/10=12(num);noc=2;
12/10=1(num)noc=3;
1/10=0.1(num)noc=4;
if num =-1,so,while loop closes because num!=0,
therefore count of numbers is 4,


*/