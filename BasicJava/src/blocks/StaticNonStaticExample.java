package blocks;

public class StaticNonStaticExample {
	/* static block or SIB */
	static {
		System.out.println("running static-block-1 of class StaticNonStaticExample..");
	}
	/* non-static block or IIB */
	{
		System.out.println("running non-static-block-1 of class StaticNonStaticExample..");
	}
	public static void main(String[] args) {
		System.out.println("main() Starts");
		StaticNonStaticExample b1 = new StaticNonStaticExample();
		System.out.println("---------------------------------");
		StaticNonStaticExample b2 = new StaticNonStaticExample();
		System.out.println("main() ends");
	}	
}
