package packages2;

import packages1.ProtectedMembers;

class AccessProtectedMembers1 extends ProtectedMembers {

	void calling() {
		System.out.println("I am calling...");
	}
	public static void main(String[] args) {
		
		AccessProtectedMembers1 p1=new AccessProtectedMembers1();
		System.out.println("Accessing Protected members from another class outside of package");
		System.out.println(p1.accNum);
		p1.displayAccNum();
		p1.calling();
	}
}
class Example1 extends AccessProtectedMembers1{
	public static void main(String[] args) {
		Example1 a1=new Example1();
		a1.calling();
		a1.displayAccNum();
		System.out.println(a1.accNum);
		AccessProtectedMembers1 p1=new AccessProtectedMembers1();
//		p1.displayAccNum();// can't access from child class directly ..it's mandatory to have child object to access inherited protected member.. 
//		System.out.println(p1.accNum); // can't access from child class
		p1.calling(); 
	}
}