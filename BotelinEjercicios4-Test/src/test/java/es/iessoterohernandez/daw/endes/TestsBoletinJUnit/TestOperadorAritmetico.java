package es.iessoterohernandez.daw.endes.TestsBoletinJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestOperadorAritmetico {
	
	@Test
	public void testSuma() {
		assertEquals(10, OperadorAritmetico.suma(7, 3));
		assertEquals(-1, OperadorAritmetico.suma(-4, 3));
		assertEquals(3, OperadorAritmetico.suma(0, 3));
	}
	
	@Test
	public void testDivision() {
		try {
			assertEquals(4, OperadorAritmetico.division(8, 2));
			assertEquals(5, OperadorAritmetico.division(25, 5));
			assertEquals(0, OperadorAritmetico.division(0, 2));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testDivisionPorCero() {
		try {
			OperadorAritmetico.division(6, 0);
            assert false : "Se lanzaría excepción si se intenta dividir por 0";
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
