package packages2;


public class AccessPublicMember0 {

	public static void main(String[] args) {
		//using fully qualified class name: packagename.classname
		packages1.PublicMembers p1=new packages1.PublicMembers();
		System.out.println("Accessing Default members from another class outside package");
		System.out.println(p1.accNum);
		p1.displayAccNum();
		packages1.PublicMembers p2 = new packages1.PublicMembers();
	}
}