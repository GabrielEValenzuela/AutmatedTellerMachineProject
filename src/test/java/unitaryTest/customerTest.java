/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitaryTest;

import AtmMVC.model.Customer;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gabriel
 */
public class customerTest {
    
    private Customer customer;
    
    @Before
    public void setUp() {
        customer = new Customer();
        customer.setFirstName("Homero");
        customer.setLastName("Simpson");
        customer.setBalance(2000);
        customer.setCustomerId(4023);
        customer.setPIN("3027");
        customer.setDoubleCheck(false);
        customer.setEmail("homero.s@yahoo.com");
        customer.setBank("NACION");
    }
    
    @Test
    public void testParametersCustomer(){
        assertEquals("Homero", customer.getFirstName());
        assertEquals("Simpson", customer.getLastName());
        assertEquals(2000, customer.getBalance(), 0.00001);
        assertEquals(4023, customer.getCustomerId());
        assertEquals("3027", customer.getPIN());
        assertEquals(false, customer.hasDoubleCheck());
        assertEquals("homero.s@yahoo.com", customer.getEmail());
        assertEquals("NACION", customer.getBank());
    }
    
}
