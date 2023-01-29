package practiceProgramsForLoop;

public class CountNumOfDigits {

	public static void main(String[] args) {
		countNumOfDigits(14562,0);
		System.out.println("NUM OF DIGITS: "+countnumOfDigits(12,0));
		int num=1225, noc=0;
		for(;num!=0;num/=10,++noc) {
		}
	System.out.println("Number of Digits: "+noc);
	
		
	}
	static void countNumOfDigits(int num,int noc) {
		for(;num!=0;num/=10,++noc) {
		}
	System.out.println("Number of Digits: "+noc);
	}
	
	
	static int countnumOfDigits(int num,int noc) {
		for(;num!=0;num=num/10,noc++) {
		}
		
		return noc;
	}
}
