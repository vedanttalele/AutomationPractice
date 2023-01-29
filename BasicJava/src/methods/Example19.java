package methods;

public class Example19 {

	float a=15.56f;
	int add(int num1,int num2) {
		return (num1+num2);
	}
	public static void main(String[] args) {
		
		Example19 m1=new Example19();
		
		System.out.println(m1.a);
		System.out.println(m1.add(12, 17));
		int sum=m1.add(12, 17);
		System.out.println("sum: "+sum);
	}

}
