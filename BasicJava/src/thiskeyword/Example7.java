package thiskeyword;

public class Example7 {
	//Global Variable or non static GV or Instance GV
		int variable = 51;
		public static void main(String args[]) {
			Example7 obj = new Example7();
			obj.method(20);
			obj.method();
			System.out.println("Value of Instance variable :" + obj.variable);//
		}
		void method(int variable) {
			System.out.println("Value of Local variable :" + variable);//
			variable = 10;
			System.out.println("Value of Local variable :" + variable);//
			System.out.println("Value of Instance variable :" + this.variable);//
			this.variable=variable;
			System.out.println("Value of Local variable :" + variable);//
			System.out.println("Value of Instance variable :" + this.variable);//
		}
		void method() {
			int variable = 40;
			System.out.println("Value of Instance variable :" + this.variable);//
			System.out.println("Value of Local variable :" + variable);//
			this.variable=variable;
			System.out.println("Value of Local variable :" + variable);//
			System.out.println("Value of Instance variable :" + this.variable);//
		}
	}