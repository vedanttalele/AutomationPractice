package finalkeyword;
                        //NonStaticLocalGlobal ---Example
public class Example5 {
	int empId=25;
	public static void main(String[] args) {
		int age=30;
		System.out.println("I am local age: "+age);
		Example5 n1=new Example5();
		n1.display();
	}
	void display() {
		int empId=45;
		System.out.println("I am local empId"+empId);
	}


	}

