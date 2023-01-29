package abstraction;

public interface InterfaceDemoExample {

	void display();
}
class Demo13 implements InterfaceDemoExample{
	
	public void display() {
		System.out.println("hello");
	}
	public static void main(String[] args) {
		Demo13 d1=new Demo13();
		d1.display();
		
	}
}