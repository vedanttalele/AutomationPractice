package oops;

class A2 {
	void msg() {
		System.out.println("Hello");
	}
}
class B2 {
	void msg() {
		System.out.println("Welcome");
	}
}
class InheritanceExample8 extends A2,B2  {
	
	InheritanceExample8(){
		super();//confusion 
	}
	public static void main(String args[]) {
		InheritanceExample8 obj = new InheritanceExample8();
		obj.msg();
	}
}
/**
is java supports multiple inheritance or not?
why java doesn't support multiple inheritance using classes?
*/