package pyramids;

public class Example3 {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			for(int j=5;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	/*	int k;
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
			}
			//while(k=1<=i) {
				System.out.print(" *");
				++k;
			}
			System.out.println();
		}*/
	}
}	