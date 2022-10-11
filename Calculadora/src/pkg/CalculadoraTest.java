package pkg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	private int value1, value2;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		value1=4;
		value2=2;
		System.out.println("BeforeEach");
	}

	@AfterEach
	void tearDown() throws Exception {
	}


	@Test
	void testSuma() {
		int expected = 6;
		int sum = Calculadora.suma (value1, value2);
		assertEquals(sum, expected);
	}

	@Test
	void testResta() {
		int expected = 2;
		int res = Calculadora.resta (value1, value2);
		assertEquals(res, expected);;
	}

	@Test
	void testMultiplica() {
		int expected = 8;
		int mul = Calculadora.multiplica (value1, value2);
		assertEquals(mul, expected);
	}

	@Test
	void testDivide() {
		int expected = 2;
		int div = Calculadora.divide (value1, value2);
		assertEquals(div, expected);
	}

}
