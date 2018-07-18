/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataBasePackage;

/**
 *
 * @author gabriel
 */
public interface QueryStatements {
    
    public boolean isValid(int id);
    public String getName(int id);
    public String getLastName(int id);
    public int getBalance(int id);
    
}
