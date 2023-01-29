package finalkeyword;

public class Example1 {

	public static void main(String[] args) {
		final int age=25;
		System.out.println("age: "+age);
		//int age3=25;
		System.out.println("age: "+age);
		//int age1=30;
		System.out.println("age: "+age); //when new variable(age2)is D/I 
		int age2=34;                     //when called it gives o/p.
 		System.out.println("age: "+age2);
	}
}/**
* anything declared with final keyword known as constant
* any variable declared with final keyword should initialize at the same time
*
*/