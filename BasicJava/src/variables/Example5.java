package variables;

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Program Starts");
//syntax to declare & initlize a variable: datatype variablename = value;
		// 25 / 15 =
int num1=25;
int num2=15;
double result=num1/num2;
System.out.println("Number 1 is : "+num1);
System.out.println("Number 2 is : "+num2);
System.out.println("Division of two number is : "+result);//1.0-----because of no double declared and initilize in variable for either num1 OR num2
System.out.println("Not using Double for either num1 OR num2");                       //1.66666666667-----------if either num1 OR num2 is declared
System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

//syntax to declare & initlize a variable: datatype variablename = value;
		// 25 /15=
		double number1=25;
		int number2=15;
		double res=(number1/number2);
		System.out.println("Number 1 is : "+num1);//25.0
		System.out.println("Number 2 is : "+num2);
		System.out.println("Division of two number is : "+res);// 1 | 1.66666.. | NOA
		System.out.println("Using double for either number1 or number2");
		System.out.println("Program ends");
	}

}
