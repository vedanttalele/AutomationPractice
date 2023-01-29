 package exceptionHandling;
public class ExceptionHandling918 
{  
    // defining a user-defined method  which throws ArithmeticException  
    static void method()
    {  
        System.out.println("Inside the method()");  
        throw new ArithmeticException("throwing ArithmeticException");  
    }  
    //main method  
    public static void main(String args[])  
    {  
    	// method();
        try  
        {  
            method();  
        }  
        catch(ArithmeticException e)  
        {  
            System.out.println("caught in main() method"+e);  
        }  
    	 System.out.println("Rest of the code");
    }  
}  