package practiceProgramsForLoop;

public class DisplayNumbers {

	public static void main(String[] args) {
		DisplayNumbers dpn =new DisplayNumbers();
		dpn.displayNumbers(6,10);
		for(int dn=1;dn<=5;dn++) {
			System.out.println("Number is "+dn);
		}
	}
	 void displayNumbers(int num,int num1) {
		for(int dn=num;dn<=num1;dn++) {
			System.out.println("Num Is :"+dn);
		}
	}

}
