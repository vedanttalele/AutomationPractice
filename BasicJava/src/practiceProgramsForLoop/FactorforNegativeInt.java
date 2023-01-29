package practiceProgramsForLoop;

public class FactorforNegativeInt {

	public static void main(String[] args) {
		int nF=-10;
		System.out.print("Factor of "+nF+" are: ");
		for(int i=-1;i>=nF;i--) {
			if(nF%i==0) {
		
			System.out.print(i+ " ");
			}
		}
		factorforNegativeInt(-25);
	}
	static int factorforNegativeInt(int nFI) {
		System.out.print("\nFactor of "+nFI+" are: ");
		for(int j=-1; j>=nFI; j--) {
			if(nFI%j==0) {
				System.out.print(j+ " ");
			}
		}
	return nFI;
	}
}