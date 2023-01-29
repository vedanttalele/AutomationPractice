package methods;

public class Example10 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		System.out.println("Area of Circle");
		areaOfCircle();
		System.out.println("!!!!!!!!!!!!!!!!!");
		System.out.println("\nArea of rectangle");
		areaOfRectangle();
		System.out.println("Program Ends");
		

	}
	public static double areaOfCircle() {
	double pi= 3.14; int radius= 20;
	double area= pi*radius*radius;
	System.out.println("Pi value is "+pi);
	System.out.println("Radius value is "+radius);
	System.out.println("Area of Circle is "+area);
		return area;
	}
	public static int areaOfRectangle()  {
		int l= 20; int w= 10;
		int area= l*w;
		System.out.println("Length is "+l);
		System.out.println("Width is "+w);
		System.out.println("Area of ractangle is "+area);
		return area;
	}
}
//method for getting area of circle
	//method for getting area of rectangle