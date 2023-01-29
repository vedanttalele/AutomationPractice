package finalkeyword;

public class Example3 {
	final int speedlimit;// blank final variable
	Example3() {
		speedlimit = 70;
		System.out.println(speedlimit);
	}
	public static void main(String args[]) {
		Example3 f1=new Example3();
		System.out.println(f1.speedlimit); 
	}
}