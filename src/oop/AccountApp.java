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
public class AccountApp {
    
    public static void main(String[] args) {
        LoanAccount la = new LoanAccount();
        la.increaseRate();
        la.setRate();
        la.SetAmmortSchedule();
        la.setTerm(20);
        //Only the methods defined in the interface
        //but when calling the methods, it's actually calling the methods from the Loan Account class
        IRate account1 = new LoanAccount();
        account1.increaseRate();
        account1.setRate();
    }
    
}
