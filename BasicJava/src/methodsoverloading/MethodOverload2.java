package methodsoverloading;

class MethodOverload11 {
	public void disp(char c)
    {
         System.out.println(c);
    }
    public void disp(char c, int num)  
    {
         System.out.println(c + " "+num);
    }
}
    public class MethodOverload2 {
	public static void main(String[] args) {
		MethodOverload11 obj = new MethodOverload11();
	       obj.disp('a');
	       obj.disp('a',10);
	}

}
