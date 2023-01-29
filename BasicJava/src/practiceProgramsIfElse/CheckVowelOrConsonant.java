package practiceProgramsIfElse;

public class CheckVowelOrConsonant {

	public static void main(String[] args) {
		checkVowelConsonant('A');
		char ch='v';
		if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') {
		    System.out.println("vowel is "+ch);
		}else {
			System.out.println("Consonant is "+ch);
		}
		
	}
	static void checkVowelConsonant(char abt) {
		if(abt=='A'|| abt=='E'|| abt=='I'|| abt=='O'|| abt=='U') {
		    System.out.println("vowel is "+abt);
		}else {
			System.out.println("Consonant is "+abt);
		}
		
	}

}
