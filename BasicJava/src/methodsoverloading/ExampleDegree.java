package methodsoverloading;

public class ExampleDegree {

	public static void main(String[] args) {
		float fahrenheit, celsius;
		fahrenheit = 43;
		celsius = ((fahrenheit - 32) * 5) / 9;
		System.out.println("Temperature in celsius is: " + celsius);
		System.out.println("***************");
		ExampleDegree m1 = new ExampleDegree();
		m1.temperaturecelsius(43);
	}

	public void temperaturecelsius(float f) {
		float res = (f - 32) * 5 / 9;
		System.out.println("Temp in celsius is: " + res);

	}
}

	/**
	 * method ---> static or non-static ---> return or not ---> argument or not
	 */

	/**
	 * method to calculate area of triangle method to calculate area of circle
	 * method to calculate area of rectangle method to calculate area of square
	 */

	


