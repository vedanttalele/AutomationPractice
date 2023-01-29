package practiceProgramsWhileLoop;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		checkPrimeNumber(8);
		int num=4,count=0,i=1;
		while(i<=num) {
			if(num%i==0) 
				count++;
			    i++;
		}
		if(count==2) {
		    System.out.println(num+ " is a Prime Number");
		
			}
			else {
		    System.out.println(num+ " is not a Prime Number");
		
			}
	}
	static void checkPrimeNumber(int num) {
		int count=0;
		int i=1;
		while(i<=num) {
			if(num%i==0)
				count++;
			i++;
		}
		if(count==2) {
			System.out.println(num+" is Prime Number");
		}else {
			System.out.println(num +" is not a Pime Number");
		}
	}

}
