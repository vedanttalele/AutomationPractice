package packages1;

public class PrivateMembers {
	private int accNum=12345;
	private void displayAccNum() {
		System.out.println("Account Number: "+accNum);
	}
	public static void main(String[] args) {
		
		PrivateMembers p1=new PrivateMembers();
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}
class AccessPrivateMembers2 {

	public static void main(String[] args) {
		
		PrivateMembers p1=new PrivateMembers();
		//System.out.println(p1.accNum);
		//p1.displayAccNum();
	}
}/*
**private member can only be access by the class in which private members are declared/initialized. i.e.,in the main method of that class.
**private members can't be access in another class or same packages or another packages as seen in the above Example 
**refer packages1.PrivateMembers for this statement.
i.e., error is given on line no.20/21.
**or use getter and setter method 
*/