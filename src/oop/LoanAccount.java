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
public class LoanAccount implements IRate {
    
    @Override
    public void setRate(){
        System.out.println("Rate");
    }
    @Override
    public void increaseRate(){
        System.out.println("INCREASE RATE");
    }
    
    public void setTerm(int terms){
        System.out.println("Setting the term to: " + terms + " years.");
    }
    
    public void SetAmmortSchedule(){
        System.out.println("Amortization Schedule");
    }
}
