package packages;

//import methods.Method2;
interface DemoInterface {

}

//import methods.DisplayOverloading;
//import methods.Method5;
//import methods.MethodCelsius;
//import methods.*;
//import day13Constructor.MethodOverloading4;
public class DemoExample implements DemoInterface{

	public void display() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Method5 m1=new Method5();
//		m1.average(25, 58, 65);
//		MethodCelsius m2=new MethodCelsius();
//		
//		DisplayOverloading d1=new DisplayOverloading();
		//fullyqualified class name---> packagename.classname
		methods.Example17 m1=new methods.Example17();
		m1.average(25, 58, 65);
		m1.average(25, 58, 65);
		
		//methods.Method2.average();
		
		methods.Example4.getAverage();
		constructors.Example1.calling();
	}

}