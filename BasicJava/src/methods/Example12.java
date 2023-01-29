package methods;

public class Example12 {

   static double salary=10000.67;
   static int empId=1001;   
   public static int printEmpID(){
	   System.out.println("printEmpID is running..");
	   return 1011;
   }   
   public static void printEmpSal(){
	   System.out.println("printEmpSal is running.."+salary);
   }   
	   public static void main(String[] args) {
		
		   int age=30;
		   System.out.println("age: "+age);
		   //want to print salary
		   System.out.println("salary: "+salary);
		   					//or
		   System.out.println("salary: "+Example12.salary);
		   //want to print empId
		   System.out.println("empId: "+Example12.empId);
		   //want to execute printEmpSal()
		   printEmpSal();
		   			//or
		   Example12.printEmpSal();
		   //want to execute printEmpID()
		   Example12.printEmpID();
		   				//or
           int id=Example12.printEmpID();  
		   System.out.println("empId: "+id);
		   					//or
		   System.out.println("empId: "+Example12.printEmpID());

	}

}