package typecasting;
class Pune{
	void Deccan() {
		System.out.println("You are in Deccan");
	}
}
class Mumbai extends Pune {
	void Kurla() {
		System.out.println("You are in Kurla");
	}
}
public class UpCasting extends Mumbai{
	void myCity() {
		System.out.println("You in city");
	}
	public static void main(String[] args) {
		
		UpCasting u1=new UpCasting();
		Mumbai m1=new UpCasting();//
		Mumbai m2=u1;//
		Pune p1=new UpCasting();//
		Pune p2=u1;//
		
		Mumbai m3=(Mumbai)new UpCasting();//
		Mumbai m4=(Mumbai)u1;//
		Pune p3=(Pune) new UpCasting();//
		Pune p4=(Pune)u1;//
		
		
		Pune p5=new Mumbai();//
		Pune p6=(Pune)new Mumbai();//
	}

}