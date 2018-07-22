/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AtmMVC.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gabriel
 */
public class DataBaseConnection {

    private final String URL="jdbc:mysql://localhost:3306/Javabank?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            //"jdbc:mysql://localhost:3306/Javabank?autoReconnet=true&useSSL=false"; 
    private final String USER="JavaAdmin";
    private final String PASSWORD = "java";
    private Connection connect = null;
    

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = (Connection) DriverManager.getConnection(this.URL, this.USER, this.PASSWORD);

        } catch (SQLException | ClassNotFoundException e) {
            System.err.println(e);
        }
        return connect;
    }

    public String getUSER() {
        return USER;
    }

    public String getURL() {
        return URL;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }
    
}
