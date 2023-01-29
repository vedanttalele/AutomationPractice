package packages1;

public class DefaultMember {
	int accNum=12345;
	void displayAccNum() {
		System.out.println("Account Number: "+accNum);
	}
	public static void main(String[] args) {		
		DefaultMember p1=new DefaultMember();
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}
class AccessDefaultMembers {

	public static void main(String[] args) {		
		DefaultMember p1=new DefaultMember();
		System.out.println("Accessing Default members from child class");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}
/**
**default member have visibility upto package level means default member can be access in another class but in same packages. 
**if default member is access in another packages it will show error
*/