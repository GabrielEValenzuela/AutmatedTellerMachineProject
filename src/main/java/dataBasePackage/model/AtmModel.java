/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataBasePackage.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author gabriel
 */
public class AtmModel {
    
    private int atmBalance;
    private int atmId;
    private QueryConnection dbcon;
    private PreparedStatement statement = null;
    private ResultSet result = null;
    
    public static void main(String[] args) {
        AtmModel model = new AtmModel();
        QueryConnection con = new QueryConnection();
        Customer customer = new Customer();
        Card card = new Card();
        con.getCard(524711, card);
        System.out.println("CardID:"+card.getCardId());
        System.out.println("Banco asociado:"+card.getBankAssociated());
        System.out.println("Cliente ID:" + card.getCustomerAssociated());
        System.out.println("Activa:" + card.isCurrentStatus());
        con.getCustomer(card.getCustomerAssociated(), customer);
        System.out.println("Nombre:"+customer.getFirstName());
        System.out.println("Apellido:"+customer.getLastName());
        System.out.println("PIN:"+customer.getPIN());
        System.out.println("Id:"+customer.getCustomerId());
        System.out.println("Balance:"+customer.getBalance());
        System.out.println("Doble verificación: "+customer.hasDoubleCheck());
        System.out.println("/////////////////////////////");
        con.getCard(524722, card);
        System.out.println("CardID:"+card.getCardId());
        System.out.println("Banco asociado:"+card.getBankAssociated());
        System.out.println("Cliente ID:" + card.getCustomerAssociated());
        System.out.println("Activa:" + card.isCurrentStatus());
        con.getCustomer(card.getCustomerAssociated(), customer);
        System.out.println("Nombre:"+customer.getFirstName());
        System.out.println("Apellido:"+customer.getLastName());
        System.out.println("PIN:"+customer.getPIN());
        System.out.println("Id:"+customer.getCustomerId());
        System.out.println("Balance:"+customer.getBalance());
        System.out.println("Doble verificación: "+customer.hasDoubleCheck());
        
    }
    public void makeDeposit(int amount,int id){
        //int buffer = (int)dbcon.getBalance(id);
        //buffer += amount;
        //try {
        //    String query = "UPDATE customerTable SET Balance="+buffer+" WHERE customerId="+id;
       //     System.out.println(query);
         //   statement = dbcon.getConnection().prepareCall(query);
           // result = statement.executeQuery();
            
        //} catch (SQLException e) {
         
        }
        
       
      
        
        
        
    }
                


