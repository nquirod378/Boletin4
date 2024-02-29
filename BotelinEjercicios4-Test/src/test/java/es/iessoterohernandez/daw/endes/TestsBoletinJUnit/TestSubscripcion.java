package es.iessoterohernandez.daw.endes.TestsBoletinJUnit;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class TestSubscripcion {
	
	private Subscripcion subscripcion;

	@BeforeEach
	public void init() {
		subscripcion = new Subscripcion(60, 6);
	}
	
	@Test
	public void testCalcularCorrectamentePrecioPorMes() {
		assertEquals(10, subscripcion.precioPorMes());
		
		
		Subscripcion subscripcion2 = new Subscripcion(78, 6);
		assertEquals(13, subscripcion2.precioPorMes());
		
	}

	public void testCancelarSubscripcion() {
		subscripcion.cancel();
		assertEquals(0, subscripcion.precioPorMes());
	}
}
