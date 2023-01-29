package abstraction;
abstract class Bike1 {
	Bike1(){
		System.out.println("Bike1");
	}
	abstract void run();
	void speed(int spd) {
		System.out.println("Bike speed: "+spd);
	}
}
class Honda4 extends Bike1 {
	Honda4(){
		
	}
	void run() {
		System.out.println("running safely");
	}
	void speed(int spd) {
		System.out.println("Honda4 speed: "+spd);
		super.speed(120);
	}
	void color() {
		System.out.println("Honda1 color is blue");
	}
}
public class AbstractClassExample0{
	public static void main(String args[]) {
		Honda4 obj = new Honda4();
		obj.run();
		obj.speed(60);
		obj.color();		
		//Bike1 b1=new Bike1(); no object will be create of Bike1 bcz it is abstract class.
		Bike1 b2=new Honda4();//Ref. can be given of Bike1 class but cannot give object of Bike1 class. 
		b2.run();             //when Reference and object name are different then only common methods and variable are accessible/chosen from them.
		b2.speed(20);
		//b2.color();
	}
}