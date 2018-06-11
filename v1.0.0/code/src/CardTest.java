import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CardTest {
	private Card c1;
	private Card c2;
	@Before
	public void Before() {
	c1 = new Card("C1111",true);
	c2 = new Card("C2222", false);
	}
	@Test
	public void testGetCurrentStatus() {
		assertEquals("pass", true, c1.getCurrentStatus());
		assertEquals("pass", false, c2.getCurrentStatus());
		
	}

	@Test
	public void testSetStatus() {
		try {
			c1.setStatus(false);
			c2.setStatus(true);
			
		} catch (Exception e) {
			fail("error");
		}
	}

	@Test
	public void testGetCardID() {
		assertEquals("pass", "C2222", c2.getCardID());
		assertEquals("pass", "C1111", c1.getCardID());
	}

}
