package thiskeyword;

public class Example2 {
	int rollno;
	float fee;
	Example2(int rollno, float fee) {		
		System.out.println("Local varibale: "+rollno);
		System.out.println("Local varibale: "+fee);
		System.out.println("Global varibale: "+this.rollno);
		System.out.println("Global varibale: "+this.fee);
		//global variable = local variable
		this.rollno = rollno;
		this.fee = fee;
		System.out.println("Local varibale: "+rollno);
		System.out.println("Local varibale: "+fee);
		System.out.println("Global varibale: "+this.rollno);
		System.out.println("Global varibale: "+this.fee);
	}
	void display() {
		System.out.println(rollno + " " +  fee);	
	}
}
class ThisKeyword01 {//if ThisKeywors01 class is deleted then ,program will execute directly.
	public static void main(String args[]) {
		Example2 s1 = new Example2(111, 5000f);
		s1.display();//
		System.out.println("********************************");
		Example2 s2 = new Example2(112, 6000f);
		s2.display();//
	}
}
/**
 * this keyword is predefined keyword, also known as instance of current class
 * ideally used to differentiate local and global variable(NSGV) when they are having same name
 * this should be used only for non-static member and inside non-static 
 */