/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AtmMVC.model;

/**
 *
 * @author Gabriel
 */


public class IllegalBalanceException extends Exception {
    private String message;
    
    public IllegalBalanceException(String message){
        this.message = message;
    }
    
    public String infoError(){
        return message;
    }
}
