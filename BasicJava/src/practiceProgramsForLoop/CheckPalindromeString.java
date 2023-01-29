package practiceProgramsForLoop;

public class CheckPalindromeString {

	public static void main(String[] args) {
		checkPalindromeString("Vedant");
		String str="Radar",revStr="";
		
		for(int i= str.length()-1;i>=0;--i) {
			revStr=revStr+str.charAt(i);
		}
		if(str.toUpperCase().equals(revStr.toUpperCase())) {
			System.out.println(str +" is a Palindrome String");
		}
		else {
			System.out.println(str +" is not a Palindrome String");
		}
	}
	static void checkPalindromeString(String A) {
		String revStr="";
		for(int i=A.length()-1;i>=0;i--) {
			revStr=revStr+A.charAt(i);
		}
		if(A.toLowerCase().equals(revStr.toLowerCase())) {
			System.out.println(A+ " is a Palindrome String");
		}
		else {
			System.out.println(A+ " is not a Palindrome String");
		}

}
}