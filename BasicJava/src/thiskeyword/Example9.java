package thiskeyword;

public class Example9 {
	 int a;
	    int b;     
	    // Parameterized constructor
	    Example9(int a, int b)
	    {
	        this.a = a;
	        this.b = b;
	    } 
	    void display()
	    {
	        //Displaying value of variables a and b
	        System.out.println("a = " + a + "  b = " + b);
	    } 
	    public static void main(String[] args)
	    {
	    	Example9 object = new Example9(10, 20);
	        object.display();
	        System.out.println(object.a+" "+object.b);//
	        Example9 object2 = new Example9(102, 201);
	        object2.display();
	        System.out.println(object2.a+" "+object2.b);//
	    }
	}