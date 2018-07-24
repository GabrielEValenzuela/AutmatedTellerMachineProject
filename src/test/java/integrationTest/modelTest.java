/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

package integrationTest;

import AtmMVC.model.ATM;
import AtmMVC.model.AtmModel;
import AtmMVC.model.Customer;
import AtmMVC.model.QueryConnection;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class modelTest {
    private Customer customer;
    private Customer secondcustomer;
    private AtmModel model;
    private ATM atm;
    private QueryConnection con;
    
    public modelTest() {
        this.customer = new Customer();
        this.secondcustomer = new Customer();
        this.model = new AtmModel();
        this.atm = new ATM();
        this.con = new QueryConnection();
        
    }
    
    @Before
    public void setUp() {
        atm.setEnable(true);
        atm.setId(101010);
        atm.setSelfBalance(200000);
        con.getCustomer(11, customer);
        con.getCustomer(111, secondcustomer);

    }
    
    @Test
    public void ParametersCorrects(){
        assertEquals("Homero", customer.getFirstName());
        assertEquals("Simpson", customer.getLastName());
        assertEquals(2000, customer.getBalance(), 0.00001);
        assertEquals(11, customer.getCustomerId());
        assertEquals("4565", customer.getPIN());
        assertEquals(false, customer.hasDoubleCheck());
        assertEquals("amantedelacomida53@yahoo.com", customer.getEmail());
        assertEquals("Marge", secondcustomer.getFirstName());
        assertEquals("Simpson", secondcustomer.getLastName());
        assertEquals(8750, secondcustomer.getBalance(), 0.00001);
        assertEquals(111, secondcustomer.getCustomerId());
        assertEquals("7070", secondcustomer.getPIN());
        assertEquals(true, secondcustomer.hasDoubleCheck());
        assertEquals("marge.s@gmail.com", secondcustomer.getEmail());
        ///
        assertEquals(true, atm.isEnable());
        assertEquals(101010, atm.getId());
        assertEquals(200000,atm.getSelfBalance(),0.00001);
    }
        
    @Test
    public void MakeExtraction(){
        try {
            model.makeExtraction(1000, customer, con, atm);
        } catch (Exception e) {
            fail("fail"+e.getMessage());
        }
        assertEquals((200000-1000),atm.getSelfBalance(),0.00001); 
        
    }
    
    @Test
    public void MakeDeposit(){
        
      model.makeDeposit(2000, customer, con, atm);
      assertEquals(2000, customer.getBalance(), 0.00001);
      assertEquals((200000+2000),atm.getSelfBalance(),0.00001);        
    }
    
    @Test
    public void TransferPayment(){
        try {
            model.makeTransferPayment(1000, customer, secondcustomer, con, atm);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        assertEquals(8750, secondcustomer.getBalance(), 0.00001);
        assertEquals(0, customer.getBalance(), 0.00001);
        assertEquals(200000,atm.getSelfBalance(),0.00001);

        
        
    }

    
}
 */