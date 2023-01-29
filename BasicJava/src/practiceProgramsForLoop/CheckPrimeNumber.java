package practiceProgramsForLoop;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		int num=7;
		int count=0;
		
			for(int i=1; i<=num;i++){
			 
				if(num%i==0) 
				count++;
			}
				if(count==2) {
			    System.out.println(num+ " is a Prime Number");
			
				}
				else {
			    System.out.println(num+ " is not a Prime Number");
			
				}
				checkPrimeNumber(11,0);
	}
	static void checkPrimeNumber(int num,int noc) {
		
		for(int i=1;i<=num;i++) {
			if(num%i==0)
	        noc++;
		}
		if(noc==2){
			System.out.println(num+" is Prime Number");
		}else {
			System.out.println(num+ " is not Prime Number");
			
		}
	}
}
