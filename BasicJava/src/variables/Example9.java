package variables;

public class Example9 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
        //area=pi*r*r
		
		int r=50;
		double pi=3.14,area;
		area=pi*r*r;
		System.out.println("r= "+r);
		System.out.println("area= "+area);
		System.out.println("**************************");
		area=(22/7)*r*r;    
		System.out.println("r= "+r);
		System.out.println("area= "+area);
		System.out.println("**************************");		
		area=3.14*r*r;
		System.out.println("r= "+r);
		System.out.println("area= "+area);
		System.out.println("**************************");
		area=(22.0/7)*r*r;
		System.out.println("r= "+r);
		System.out.println("area= "+area); 
		System.out.println("Programs Ends");
	}

}
