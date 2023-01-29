package packages1;

public class AccessDefaultMember {

	public static void main(String[] args) {
		
		DefaultMember p1=new DefaultMember();
		System.out.println("Accessing default members from another class within same package");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}

}