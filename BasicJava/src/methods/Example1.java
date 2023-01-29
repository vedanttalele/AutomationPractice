package methods;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Program Starts");
int res=sample();

System.out.println("value of res is "+res);

System.out.println("Program Ends");
	}

	static int sample()
	{
		int a=10;
		System.out.println("running sample method program");
		return a;  //directly we can use 10 instead of a by not D/I(int a=10);
	}

	}
