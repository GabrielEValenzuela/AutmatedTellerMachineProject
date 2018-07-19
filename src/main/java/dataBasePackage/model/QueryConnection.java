/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataBasePackage.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author gabriel
 */
public class QueryConnection extends DataBaseConnection  {
      
    public boolean getCustomer(int id, Customer customer){
        
    Connection connection = getConnection();
    PreparedStatement statement = null;
    ResultSet result = null;
    
    String query = "SELECT * FROM customerTable WHERE customerId="+id;
    try{
    statement = connection.prepareStatement(query);
    result = statement.executeQuery();
    if(result.next()){
        customer.setFirstName(result.getString("firstName"));
        customer.setLastName(result.getString("lastName"));
        customer.setEmail(result.getString("email"));
        customer.setBalance(result.getFloat("balance"));
        customer.setDoubleCheck(result.getBoolean("doubleCheck"));
        customer.setPIN(Integer.parseInt(result.getString("PIN")));
        customer.setCustomerId(result.getInt("customerId"));
    }
    return true;
    }
   
    
    catch(Exception e){
        return false;
    }
    
    finally{
        try {
            connection.close();
        } catch (Exception e) {
        }
    }
    }
    
    public boolean getCard(int id, Card card){
        
    Connection connection = getConnection();
    PreparedStatement statement = null;
    ResultSet result = null;
    
    String query = "SELECT * FROM cardTable WHERE cardId="+id;
    try{
    statement = connection.prepareStatement(query);
    result = statement.executeQuery();
    if(result.next()){
        card.setCardId(result.getInt("cardId"));
        card.setBankAssociated(result.getString("bankAssociated"));
        card.setCustomerAssociated(result.getInt("customerAssociated"));
        card.setCurrentStatus(result.getBoolean("currentStatus"));
    }
    return true;
    }
   
    
    catch(Exception e){
        return false;
    }
    
    finally{
        try {
            connection.close();
        } catch (Exception e) {
        }
    }
    }
}