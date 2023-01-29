package constructors;

public class Example4 {
	int roll;
	double salary;
	Example4(int r,double s){
		roll=r;
		salary=s;
	}
	void display() {
		System.out.println(roll + " " + salary);
	}
	public static void main(String args[]) {
		Example4 c1 = new Example4(101,250045.45);
		c1.display();
		Example4 c2 = new Example4(201,550045.45);		
		c2.display();
	}
}
/**
 * with parameterize constructor we can initialize each object member 
 * with different values
 */ 