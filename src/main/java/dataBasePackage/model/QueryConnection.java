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
public class QueryConnection extends DataBaseConnection  implements QueryStatements {
    
    Connection connection = getConnection();
    PreparedStatement statement = null;
    ResultSet result = null;

    @Override
    public boolean isValid(int id) {
       String query = "SELECT currentStatus FROM cardTable WHERE cardId="+id;
       
        try {
            statement = connection.prepareCall(query);
            result = statement.executeQuery();
            return result.getBoolean("currentStatus");
            
        } catch (SQLException e) {
            SQLError("Tarjeta no válida/Inactiva");
            return false;
        }
        
    }
    @Override
    public String bankAssociated(int id){
        String query = "SELECT bankAssociated FROM cardTable WHERE cardId="+id;
       
        try {
            statement = connection.prepareCall(query);
            result = statement.executeQuery();
            return result.getString("bankAssociated");
            
        } catch (SQLException e) {
            SQLError("No existe entidad bancaria.");
            return null;
        }
    }
    @Override
    public int getCustomerID(int id){
        String query = "SELECT customerAssociated FROM cardTable WHERE cardId="+id;
       
        try {
            statement = connection.prepareCall(query);
            result = statement.executeQuery();
            return result.getInt("customerAssociated");
            
        } catch (SQLException e) {
            SQLError("El cliente no existe.");
            return 0;
        }
    }

    @Override
    public String getName(int id) {
       String query = "SELECT firstName FROM customerTable WHERE customerId="+id;
       try {
            statement = connection.prepareCall(query);
            result = statement.executeQuery();
            return result.getString("firstName");
            
        } catch (SQLException e) {
            SQLError("No existe el cliente.");
            return null;
        }
        
    }
    
    

    @Override
    public String getLastName(int id) {
       String query = "SELECT lastName FROM customerTable WHERE customerId="+id;
       try {
            statement = connection.prepareCall(query);
            result = statement.executeQuery();
            return result.getString("lastName");
            
        } catch (SQLException e) {
            SQLError("No existe el cliente.");
            return null;
        }
        
    }


    @Override
    public int getBalance(int id) {
        String query = "SELECT balance FROM customerTable WHERE customerId="+id;
        try {
            statement = connection.prepareCall(query);
            result = statement.executeQuery();
            return (int)result.getFloat("balance");
            
        } catch (SQLException e) {
            SQLError("No existe el cliente.");
            return 0;
        }
    }
    
    @Override
    public int getPIN(int id) {
        String query = "SELECT PIN FROM customerTable WHERE customerId="+id;
        try {
            statement = connection.prepareCall(query);
            result = statement.executeQuery();
            return result.getInt("PIN");
            
        } catch (SQLException e) {
            SQLError("No existe el cliente.");
            return 0;
        }
    }
    
    @Override
    public String SQLError(String mensage){
        return "Error: "+mensage;
    }

    @Override
    public int getPIN2(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean doublePIN(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
}
