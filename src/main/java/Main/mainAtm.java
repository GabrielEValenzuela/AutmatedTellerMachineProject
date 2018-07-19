/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import dataBasePackage.model.AtmModel;

/**
 *
 * @author gabriel
 */
public class mainAtm {
    
    public static void main(String[] args) {
        
        AtmModel model = new AtmModel();
        model.makeDeposit(300, 11);
        
    }
    
}
