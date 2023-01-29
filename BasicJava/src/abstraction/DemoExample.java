package abstraction;

//import methods.Example4;

//import methods.DisplayOverloading;
//import methods.Example17;
//import methods.MethodCelsius;
import methods.*;
//import day13Constructor.MethodOverloading4;
public class DemoExample {

	public void display() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Example17 m1=new Example17();
//		m1.average(25, 58, 65);
//		MethodCelsius m2=new MethodCelsius();
//		
//		DisplayOverloading d1=new DisplayOverloading();
		//fullyqualified class name---> packagename.classname
		methods.Example17 m1=new methods.Example17();
		m1.average(25, 58, 65);
		m1.average(25, 58, 65);
		
		methods.Example4.getAverage();
		
		Example4.getAverage();
		constructors.Example1.calling();
	}

}


