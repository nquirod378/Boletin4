package es.iessoterohernandez.daw.endes.TestsBoletinJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPila {
	
	private Pila pila;

	@BeforeEach
	public void init() {
		pila = new Pila();
	}
	
	@Test
	public void testPushPila() {
		pila.push(7);
		assertEquals((Integer)7, pila.top());
		
		pila.push(8);
		assertEquals((Integer)8, pila.top());
		
		pila.push(1);
		assertEquals((Integer)8, pila.top());
	}
	
	@Test
	public void testPopPila() {
		pila.push(5);
        pila.push(8);
        assertEquals((Integer)8, pila.pop());
        assertEquals((Integer)5, pila.pop());
	}
	
	@Test
	public void testPilaVacia() {
		assertTrue(pila.isEmpty());

        pila.push(7);
        assertFalse(pila.isEmpty()); 

        pila.pop();
        assertTrue(pila.isEmpty()); 
	}

}
