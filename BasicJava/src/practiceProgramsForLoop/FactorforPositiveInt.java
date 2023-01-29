package practiceProgramsForLoop;

public class FactorforPositiveInt {

	public static void main(String[] args) {
		int pF=5;
		System.out.print("Factors  of "+pF+" are: ");
		for(int i=1;i<=pF;i++) {
			if(pF%i==0) {
				System.out.print(i+ " ");
				
			}
		}
		
		factorforPositiveInt(2021);
	}
	static int factorforPositiveInt(int pFI) {
		
		System.out.print("\nFactors  of "+pFI+" are: ");for(int j=1;j<=pFI;j++) 
			if(pFI%j==0) {
				System.out.print(j+ " ");		
			}
		
		return pFI;
	}
}
