import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class EmpleadoTest {

	Empleado empleado;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		this.empleado = new Empleado();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	
	/*******************************************************************************************/

	@Test
	void pruebaEncargado() {
		float expected = 2900;
		float resultado = this.empleado.calculoNominaBruta(TipoEmpleado.Encargado, 1100, 10);
		assertEquals(expected, resultado);
	}


	@Test
	void pruebaVendedor() {
		float expected = 2400;
		float resultado = this.empleado.calculoNominaBruta(TipoEmpleado.Vendedor, 1100, 10);
		assertEquals(expected, resultado);
	}


	/*******************************************************************************************/


	@Test
	void pruebaSinPrima() {
		float expected = 2800;
		float resultado = this.empleado.calculoNominaBruta(TipoEmpleado.Encargado, 800, 10);
		assertEquals(expected, resultado);
	}

	@Test
	void pruebaConPrima1() {
		float expected = 2900;
		float resultado = this.empleado.calculoNominaBruta(TipoEmpleado.Encargado, 1000, 10);
		assertEquals(expected, resultado);
	}

	@Test
	void pruebaConPrima2() {
		float expected = 3000;
		float resultado = this.empleado.calculoNominaBruta(TipoEmpleado.Encargado, 1500, 10);
		assertEquals(expected, resultado);
	}


	/*******************************************************************************************/

	@Test
	void pruebaConExtra() {
		float expected = 2400;
		float resultado = this.empleado.calculoNominaBruta(TipoEmpleado.Vendedor, 1000, 10);
		assertEquals(expected, resultado);
	}

	@Test
	void pruebaSinExtra() {
		float expected = 2100;
		float resultado = this.empleado.calculoNominaBruta(TipoEmpleado.Vendedor, 1000, 0);
		assertEquals(expected, resultado);
	}

	/*******************************************************************************************/


	@Test
	void pruebanetaTramo0() {
		float expected = 2000;
		float bruto = this.empleado.calculoNominaBruta(TipoEmpleado.Vendedor, 0, 0);
		float resultado = this.empleado.calculoNominaNeta(bruto);
		assertEquals(expected, resultado);
	}	


	@Test
	void pruebanetaTramo15() {
		float expected = 1870;
		float bruto = this.empleado.calculoNominaBruta(TipoEmpleado.Vendedor, 1500, 0);
		float resultado = this.empleado.calculoNominaNeta(bruto);
		assertEquals(expected, resultado);
	}	


	@Test
	void pruebanetaTramo18() {
		float expected = 2050;
		float bruto = this.empleado.calculoNominaBruta(TipoEmpleado.Encargado, 0, 0);
		float resultado = this.empleado.calculoNominaNeta(bruto);
		assertEquals(expected, resultado);
	}

}
