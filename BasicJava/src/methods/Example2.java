package methods;

public class Example2 {

	public static void main(String[] args) {
		
		System.out.println("Program Starts");
		
		addTwoNumbers(20,30);
		
				int x=10,y=20,res;		
				res=x+y;
				System.out.println("X: "+x);
				System.out.println("Y: "+y);
				System.out.println("res: "+res);
				System.out.println("!!!!!!!!!!!!");
				
				x=100;
				y=200;		
				res=x+y;
				System.out.println("X: "+x);
				System.out.println("Y: "+y);
				System.out.println("res: "+res);
				System.out.println("@@@@@@@@@@@@");
				
				x=101;
				y=202;		
				res=x+y;
				System.out.println("X: "+x);
				System.out.println("Y: "+y);
				System.out.println("res: "+res);
			    System.out.println("############");
				
				x=105;
				y=208;		
				res=x+y;
				System.out.println("X: "+x);
				System.out.println("Y: "+y);
				System.out.println("res: "+res);
		
		System.out.println("Program Ends");
	}
		public static int addTwoNumbers(int a,int b) {
		int result= a+b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(result);
		System.out.println("!!!!!!!");
		return result;
		
		}	
}
