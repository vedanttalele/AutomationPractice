package conditionsloops;

public class DoWhile3 {

	public static void main(String[] args) {
		/* local variable Initialization */ 
		int n = 5, times = 2;
		/* do-while loops execution */
		do {
			System.out.println("Java do while loops:" + n);
			n++;
		} while (n <= times);//1<=0
		//n=1;
		while(n>=times) {
			System.out.println("Java while loops:" + n);
			n--;
		}
	}
}
/**
 * while--> check condition --->body
 * do-while--> first body --->condition
 */ 
	


