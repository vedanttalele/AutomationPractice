package methodsoverloading;
/**
 * what if return type, method name and argument list are same.
 */
public class MethodOverload4 {

	   public int myMethod(int num1, int num2)
	   { 
	       System.out.println("First myMethod of class Demo");
	       return num1+num2;
	   }
	   public int myMethod(int var1, short var2) //to clear error ,used short instead
                                                           //        of int	   
	   {
	       System.out.println("Second myMethod of class Demo"); 
	       return var1-var2;
	   }

	   public static void main(String args[])
	   {
		   MethodOverload4 obj1= new MethodOverload4();
	       obj1.myMethod(10,10);
	       obj1.myMethod(20,12);
	   }
	}


