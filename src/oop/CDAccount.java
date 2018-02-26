/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author sua2g16
 */
public class CDAccount extends BankAccount implements IRate{
    
    String interestRate;
    
    void compound(){
        System.out.println("Compounding interest");
    }
    
}
