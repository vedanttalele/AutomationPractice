package thiskeyword;

public class Example1 {
	int rollno;
	float fee;
	Example1(int rollno, float fee) {		
		rollno = rollno;
		fee = fee;
	}
	void display() {
		System.out.println(rollno + " " +  fee);
	}
}
class ThisKeyword1 {
	public static void main(String args[]) {
		Example1 s1 = new Example1(111, 5000f);
		s1.display();//
		Example1 s2 = new Example1(112, 6000f);
		s2.display();//
	}
}
/*
 * if main method is not present in classname file
 *  i.e,Example7===>line no3,then all classes in java program will not executive 
 *  directly and if executed then console will show any other/previous program result. 
 */
