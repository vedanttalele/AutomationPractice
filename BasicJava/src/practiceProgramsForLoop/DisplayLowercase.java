package practiceProgramsForLoop;

public class DisplayLowercase {

	public static void main(String[] args) {
		DisplayLowercase dl = new DisplayLowercase();
		dl.displayLowercase();
		char c;
		for(c='a';c<='z';c++) {
			System.out.println("Lowercase Alphabet is "+c);
		}
	}
	public void displayLowercase() {
		char ch;
		for (ch='a';ch<='z';ch++){
				System.out.println("lowercase Character is: "+ch);
		}		
	}
}
