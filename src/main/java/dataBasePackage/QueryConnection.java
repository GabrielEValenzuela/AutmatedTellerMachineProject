/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataBasePackage;

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
       String query = "SELECT cardId FROM cardTable WHERE cardId=?";
       
        try {
            statement = connection.prepareCall(query);
            statement.setInt(1,id);
            result = statement.executeQuery();
            return result.next();
            
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }
        
    }

    @Override
    public String getName(int id) {
  return null;
        
    }

    @Override
    public String getLastName(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getBalance(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
   
    
}
