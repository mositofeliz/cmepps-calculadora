package pkg;

public class Calculadora {
	
	public static int suma(int a, int b) {
		int suma = a + b;
		return suma;
	}
	
	public static int resta(int a, int b) {
		int resta = a - b;
		return resta;
	}
	
	public static int multiplica(int a, int b) {
		int multiplica = a * b;
		return multiplica;
	}
	
	public static int divide(int a, int b) {
		int divide = 0;
		if(b != 0) {
			divide = a / b;
		}
		else {
			divide = -1;
		}
			return divide;
	}
}
