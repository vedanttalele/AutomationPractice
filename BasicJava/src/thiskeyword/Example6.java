package thiskeyword;

public class Example6 {
	int variable = 5;	
	int age=10;
	public static void main(String args[]) {
		Example6 obj = new Example6();
		obj.method(20);
		obj.method();	
		System.out.println("obj GV variable: "+obj.variable);//
		Example6 obj2 = new Example6();
		System.out.println("obj2 GV variable: "+obj2.variable);//
	}
	void method(int variable) {
		System.out.println("Value of variable :" + variable);//
		System.out.println("GV Value of variable :" + this.variable);//
		this.variable=variable;
		System.out.println("Value of variable :" + variable);//
		System.out.println("GV Value of variable :" + this.variable);//
	}
	void method() {
		int variable = 40;
		System.out.println("Value of variable :" + variable);
	}
}