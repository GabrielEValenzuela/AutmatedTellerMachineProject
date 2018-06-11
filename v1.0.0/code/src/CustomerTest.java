import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CustomerTest {
	private Customer cust1;
	private Customer cust2;
	@Before
	public void Before() {
	cust1 = new Customer("Homero","Simpson","0742");
	cust2 = new Customer("Montgomery","Burns","0001");
	}	
	
	@Test
	public void testGetName() {
		assertEquals("error", "Homero", cust1.getName());
		assertEquals("error", "Montgomery", cust2.getName());
	}

	@Test
	public void testGetSurname() {
		assertEquals("error", "0742", cust1.getAccountID());
		assertEquals("error", "0001", cust2.getAccountID());
	}
		
	
	@Test
	public void testGetPIN() {
		cust1.setPIN("1234");
		cust2.setPIN("4321");
		assertEquals("error", "1234", cust1.getPIN());
		assertEquals("error", "4321", cust2.getPIN());
	}
	
}