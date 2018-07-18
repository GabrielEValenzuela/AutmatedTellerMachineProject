/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataBasePackage;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class main {

    public static void main(String[] args) {
        DataBaseConnection db = new DataBaseConnection();
        QueryConnection q = new QueryConnection();
        
        if(q.isValid(524722)){
            System.out.println("Si");
        }
        if (q.isValid(524712)){
            System.out.println("No");
        }
        
        try {
            db.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}

