package pkg;

public class Calculadora {

	private int a, b;
	
	public Calculadora() {
		
	}
	
	public Calculadora(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int suma() {
		int suma = this.a + this.b;
		return suma;
	}
	
	public int resta() {
		int resta = this.a - this.b;
		return resta;
	}
	
	public int multiplica() {
		int multiplica = this.a * this.b;
		return multiplica;
	}
	
	public int divide() {
		int divide = 0;
		if(this.b != 0) {
			divide = this.a % this.b;
		}
		else {
			divide = -1;
		}
			return divide;
	}
}
