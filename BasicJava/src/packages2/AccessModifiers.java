package packages2;

import packages1.Modifiers;

public class AccessModifiers extends Modifiers{
	public static void main(String[] args) {

		AccessModifiers a1=new AccessModifiers();
//		System.out.println("private variable: "+a1.num1);
//		System.out.println("default variable: "+a1.num2);
		System.out.println("protected variable: " + a1.num3); //can be access through only child class inheritance.
		System.out.println("public variable with protected way: "+a1.num4);//an be access through child class inheritance and direct class object.
		Modifiers m1 = new Modifiers();
		//System.out.println("private variable: " + m1.num1);
		//System.out.println("default variable: " + m1.num2);
		//System.out.println("protected variable: " + m1.num3);
		System.out.println("public variable: " + m1.num4);
	}
}