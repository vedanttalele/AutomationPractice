package methodsoverloading;

public class MethodOverload5 {
	   public int myMethod(int num1, int num2)
	   {
	      System.out.println("First myMethod of class Demo");
	      return num1+num2;
	   }
	   public double myMethod(int var1, double var2)
	   {
	      System.out.println("Second myMethod of class Demo");
	      return var1-var2;
	   }
	   public static void main(String args[])
	   {
		   MethodOverload5 obj2= new MethodOverload5();
	      obj2.myMethod(10,10);
	      obj2.myMethod(20,12);
	}

}
/**
 * Question 2 – return type is different. Method name & argument list same.
 */