/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataBasePackage.model;

/**
 *
 * @author gabriel
 */
public interface QueryStatements {
    
    public boolean isValid(int id);
    public String getName(int id);
    public String getLastName(int id);
    public int getBalance(int id);
    public int getPIN(int id);
    public int getPIN2(int id);
    public boolean doublePIN(int id);
    public int getCustomerID(int id);
    public String bankAssociated(int id);
    public String SQLError(String message);
    
    
}
