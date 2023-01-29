package oops;
//parent class
class Vehicles {
	public void wheels() {
		System.out.println("I have wheels");
	}
}
//first child class of vehicle class
class bike extends Vehicles {
	public void countwl() {
		System.out.println("I have two wheels");
	}
}
//second child class of vehicle class
class cars extends Vehicles {
	public void countwls() {
		System.out.println("I have four wheels");
	}
}
//third child class of vehicle class
class scooter extends Vehicles {
	public void countwhls() {
		System.out.println("I have two wheels");
	}
}
public class InheritanceExample7 {

	public static void main(String[] args) {
		// object of scooter class
		scooter sc = new scooter();
		sc.countwhls();
		sc.wheels();
		//object of scooter class
		cars c = new cars();
		c.wheels();
		c.countwls();
		//object of bike class
		bike b = new bike();
		b.countwl();
		b.wheels();
	}
}
