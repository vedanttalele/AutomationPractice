package blocks;

public class NonStaticExample2 {
	NonStaticExample2(){
		System.out.println("zero-param cons...");
	}	
	/* non-static block or IIB*/
	{
		System.out.println("running non-static-block-1 of class NonStaticExample2..");
	}	
	public static void main(String[] args) {
		System.out.println("main() Starts");
		NonStaticExample2 b1=new NonStaticExample2();
		System.out.println("---------------------------------");
		NonStaticExample2 b2=new NonStaticExample2();
		System.out.println("main() ends");
	}	
	/* non-static block or IIB*/
	{
		System.out.println("running non-static-block-2 of class NonStaticExample2..");
	}
}