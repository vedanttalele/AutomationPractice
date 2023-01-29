package oops;
	class testing1{
		void callingFromVoda() {
			System.out.println("Vodaphone network busy");
		}
	}
	class testing2{
		void callingFromIdea() {
			System.out.println("Get Idea sirji");
		}
	}
	class testing3{
		void callingFromAirtel() {
			System.out.println("try evrything");
		}
	}
	public class InheritanceExample {
		void callingMe() {
			System.out.println("I am calling....");
		}
		public static void main(String[] args) {
			InheritanceExample e1=new InheritanceExample();
			e1.callingMe();
			testing1 t1=new testing1();
			t1.callingFromVoda();
			testing2 t2=new testing2();
			t2.callingFromIdea();
			testing3 t3=new testing3();
			t3.callingFromAirtel();
		}
}
