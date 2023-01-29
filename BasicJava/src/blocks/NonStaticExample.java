package blocks;

public class NonStaticExample {

	NonStaticExample(){
		System.out.println("zero-param");
	}
	NonStaticExample(int i){
		System.out.println("int-param");
	}
	/* non-static block or IIB */
	{
		System.out.println("running non-static-block1 of class NonStaticExample..");
	}
	public static void main(String[] args) {
		System.out.println("main() Starts");
		NonStaticExample b1 = new NonStaticExample();
		System.out.println("---------------------------------");
		NonStaticExample b2 = new NonStaticExample(10);
		System.out.println("main() ends");
	}
}