package conditionsloops;

public class WhileLoop1 {

	public static void main(String[] args) {
		int i = 0;
		System.out.println("Printing numbers from 1 to 5");
		/*
		 * while (boolean Condition) 
		 * { //code snippet
		 * }
		 */
		{
		while (i < 5) {
			System.out.println("Hello " + i);
			i++;
		}
		
		int a=5;
		while(a>0) {
			System.out.println("bye " + a);
			a--;
		}
	}

}
}