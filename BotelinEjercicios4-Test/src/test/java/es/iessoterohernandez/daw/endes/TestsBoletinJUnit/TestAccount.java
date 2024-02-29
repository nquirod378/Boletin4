package es.iessoterohernandez.daw.endes.TestsBoletinJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestAccount {
	
	private Account account;

	@BeforeEach
	public void init() {
		account = new Account("Patricia Martinez", 0001, 2500);
	}
	
	@Test
	public void testAniadirDineroCuenta() {
		account.deposit(1000);
		assertEquals(3500, account.getBalance());
		
		account.deposit(-1000);
		assertEquals(3500, account.getBalance());
	}
	
	
	@Test
	public void testRetirarDineroCuenta() {
		account.withdraw(-1000, 0.05f);
		assertEquals(3500, account.getBalance());
		
		account.withdraw(1000, 50f);
		assertEquals(2450, account.getBalance());
	}
	

	@Test
	public void testAniadirInteresCorrectamente() {
		assertEquals(2612.5, account.addInterest());
	}

}
