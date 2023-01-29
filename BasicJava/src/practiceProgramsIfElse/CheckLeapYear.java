package practiceProgramsIfElse;

public class CheckLeapYear {

	public static void main(String[] args) {
		int year=2020;
		if((year%4==0) && (year%100!=0) || (year%400==0)){
			System.out.println("Leap Year is "+year);
		}else {
			System.out.println(year+" is Common Year");
		}
		checkleapyear(2021);
		System.out.println(checkleapYear(2022));
		
	}
	static void checkleapyear(int year) {
		if((year%4==0) && (year%100!=0) || (year%400==0)){
			System.out.println("Leap Year is "+year);
			
		}else {
			System.out.println(year+" is Common Year");
			
	      }
	
	}
	static int checkleapYear(int year) {
		if((year%4==0) && (year%100!=0) || (year%400==0)){
			System.out.println("Leap Year is "+year);
			return 1;
			
		}else {
			System.out.println(year+" is Common Year");
			return 0;
			
	      }
	
	}
}

