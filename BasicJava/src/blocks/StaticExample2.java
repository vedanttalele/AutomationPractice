package blocks;

public class StaticExample2 {
	/* static block or SIB */
	static {
		System.out.println("running static-block-1 of class StaticExample2..");
	}
	public static void main(String[] args) {
		System.out.println("main() Starts");
		System.out.println("I am main() of StaticExample2 class...");
		System.out.println("main() ends");
	}
	/* static block or SIB */
	static {
		System.out.println("running static-block-2 of class StaticExample2..");
	}
}