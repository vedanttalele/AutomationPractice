package oops;
//parent class/super class/base class
class fruit {
	fruit(){
		System.out.println("fruit class cons..");
        	
	}
	public void taste() {
		System.out.println("Fruits are sweet");
	
	}
	
}
//child class/sub-class of fruit
class apple extends fruit {
	apple(){
		//super(); //java compiler will write default super()
		System.out.println("Apple class Cons..");
	}
	public void shape() {
		System.out.println("Apple is round");
		super.taste();
	}
}
public class InheritanceExample5 {
	public static void main(String[] args) {
		apple fr = new apple(); // object of child class
		fr.shape();
	}
}