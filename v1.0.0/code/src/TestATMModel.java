import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestATMModel {
	
	private ATMModel A1;
	private Customer cust1;
	private Customer cust2;
	private static final double DELTA = 1e-15;
	@Before
	public void Before() {
		A1 = new ATMModel("ATM1", 500);
		A1.setStatus(true);
		cust1 = new Customer("Homero", "Simpson", "C001");
		cust2 = new Customer("Marge", "Simpson", "C002");
		try {
			cust1.setBalance(300);
			cust2.setBalance(500);
		} catch (IllegalBalanceException e) {
		}

	}

	@Test
	public void testSetStatus() {
		try {
			A1.setStatus(false);
		} catch (Exception e) {
			fail("error");
		}
	}

	@Test
	public void testGetAtmId() {
		assertEquals(null, "ATM1", A1.getAtmId());
	}

	@Test
	public void testGetCurrentStatus() {
		assertEquals(null, true, A1.getCurrentStatus());
	}

	@Test
	public void testGetBalance() {
		assertEquals(500, A1.getBalance(),DELTA);
	}

	@Test
	public void testUpdateBalance() {
		
		try {
			A1.UpdateBalance(100);
			assertEquals(600, A1.getBalance(),DELTA);
			A1.UpdateBalance(-200);
			assertEquals(400, A1.getBalance(),DELTA);
		} catch (IllegalBalanceException e) {
}
		
	}
	
	@Test
	public void testMakeExtraction() {
		try {
			
			A1.MakeExtraction(cust1,100);
			A1.MakeExtraction(cust1,400);
			A1.setStatus(false);
			A1.MakeExtraction(cust1,100);
			A1.UpdateBalance(0);
			A1.MakeExtraction(cust1,100);
		} catch (IllegalBalanceException e) {
	}
		
	}
	
	@Test
	public void testMakeDeposit() {
		assertEquals(500, A1.getBalance(),DELTA);
		assertEquals(300, cust1.getBalance(),DELTA);
		A1.MakeDeposit(cust1, 500);
		assertEquals(1000, A1.getBalance(),DELTA);
		assertEquals(800, cust1.getBalance(),DELTA);
		A1.MakeDeposit(cust1, -500);
		assertEquals(1000, A1.getBalance(),DELTA);
		assertEquals(800, cust1.getBalance(),DELTA);
	}
	
	@Test
	public void testMakeTransfer() {
		A1.MakeTransfer(cust1, cust2, 100);
		assertEquals(200, cust1.getBalance(),DELTA);
		assertEquals(600, cust2.getBalance(),DELTA);
		A1.MakeTransfer(cust2, cust1, 1000);
		assertEquals(200, cust1.getBalance(),DELTA);
		assertEquals(600, cust2.getBalance(),DELTA);
		A1.MakeTransfer(cust2, cust1, 200);
		assertEquals(400, cust1.getBalance(),DELTA);
		assertEquals(400, cust2.getBalance(),DELTA);		
	}
	
	@Test
	public void testMakePayment() {
		assertEquals(300, cust1.getBalance(),DELTA);
		A1.MakePayment(cust1, 300);
		assertEquals(0, cust1.getBalance(),DELTA);
		try {
			cust1.setBalance(500);
		} catch (IllegalBalanceException e) {
			e.printStackTrace();
		}
		A1.MakePayment(cust1, 2000);
		assertEquals(500, cust1.getBalance(),DELTA);
	}
	

}
