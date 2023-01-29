package abstraction;
interface Bank {
	float rateOfInterest();//by default ----> public abstract
}
class SBI1 implements Bank {
	public float rateOfInterest() {
		return 9.15f;
	}
}
class PNB1 implements Bank {
	public float rateOfInterest() {
		return 9.7f;
	}
}
class InterfaceExample0 {
	public static void main(String[] args) {
		SBI1 s1=new SBI1();
		System.out.println("SBI ROI: " + s1.rateOfInterest());
		PNB1 p1=new PNB1();
		System.out.println("PNB ROI: " + p1.rateOfInterest());
		Bank b = new PNB1();
		System.out.println("ROI: " + b.rateOfInterest());
	}
}
//100% abstract
	//used for abstraction and also used for multiple inheritance
	//variable ---> by default ---> public static final
	//method   ---> by default --->public abstract
	//no constructor
	//no complete method
	//whenever any subclass try to inherit interface they should "implements" keyword instead of "extends"