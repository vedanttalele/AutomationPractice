package practicePrograms;

public class Example3 {

	public static void main(String[] args) {
		ASCIValue('a');
		for(char c1='a';c1<='z';c1++) {
			int temp=c1;
			System.out.println(c1+" : "+temp);
		}
	}
public static void ASCIValue(int a) {
	
	System.out.println("ASCII Value is "+a);
}
}
