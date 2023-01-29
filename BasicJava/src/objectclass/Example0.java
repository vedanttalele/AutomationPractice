package objectclass;
public class Example0 extends Demo{
	// Driver code
	public static void main(String args[]) {
		Example0 s = new Example0();
		// Below two statements are equivalent
		System.out.println(s);//s.toString() -->string representation of an object
		System.out.println(s.toString());//string representation of an object
		System.out.println(s.hashCode());//it convert hexadecimal address in to decimal and return the value
		Demo d1=new Demo();
		System.out.println(d1);
		System.out.println(d1.toString());	
		System.out.println(d1.hashCode());//		
	}
}