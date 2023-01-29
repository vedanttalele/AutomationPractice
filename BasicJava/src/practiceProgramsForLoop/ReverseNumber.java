package practiceProgramsForLoop;

public class ReverseNumber {

	public static void main(String[] args) {
		int num=1245, rn=0;
		for(;num!=0;num/=10) {
			int digit=num%10;
			rn= rn *10+ digit;
		}
		System.out.println("Reversed Number: "+rn);
	}

}