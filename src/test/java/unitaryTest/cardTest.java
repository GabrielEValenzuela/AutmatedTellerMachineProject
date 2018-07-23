/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitaryTest;

import AtmMVC.model.Card;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gabriel
 */
public class cardTest {

    private Card card;

    @Before
    public void setUp() {
        card = new Card();
        card.setCardId(1547);
        card.setCurrentStatus(true);
        card.setCustomerAssociated(15472);
        card.setBankAssociated("NACION");
    }

    @Test
    public void testParametersCard() {
        assertEquals(1547, card.getCardId());
        assertEquals(true, card.isCurrentStatus());
        assertEquals(15472, card.getCustomerAssociated());
        assertEquals("NACION", card.getBankAssociated());
    }

}
