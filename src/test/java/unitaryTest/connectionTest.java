/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitaryTest;

import AtmMVC.model.Card;
import AtmMVC.model.Customer;
import AtmMVC.model.QueryConnection;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gabriel
 */
public class connectionTest {
    private QueryConnection con;
    private Customer custTest;
    private Card cardTest;
    @Before
    public void setUp() {
        con = new QueryConnection();
        custTest = new Customer();
        cardTest = new Card();
    }
    
    @Test
    public void getDataTest(){
        assertEquals(true, con.getCard(524711, cardTest));
        assertEquals(true, con.getCustomer(11, custTest));
    }
    
    
    
}
