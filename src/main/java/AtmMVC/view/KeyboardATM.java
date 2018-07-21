/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AtmMVC.view;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Gabriel
 */
public interface KeyboardATM {
    
    static void keyboard(char input, JTextField text){
       StringBuilder str = new StringBuilder();
            str.append(text.getText());
            str.append(input);
            text.setText(str.toString()); 
    }
    
    static void keyboard(char input, JPasswordField password, int MAXLENGHT){
        if (password.getPassword().length < MAXLENGHT) {
            StringBuilder str = new StringBuilder();
            str.append(password.getPassword());
            str.append(input);
            password.setText(str.toString());
        }
    }
    
}
