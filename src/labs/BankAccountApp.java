/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labs;

/**
 *
 * @author sua2g16
 */
public class BankAccountApp {
    
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("4653298746",1000.50);
        BankAccount acc2 = new BankAccount("654132987",2000);
        BankAccount acc3 = new BankAccount("321569756",2500);
        acc1.setName("Jim");
        System.out.println(acc1.getName());
        acc1.makeDeposit(500);
        acc1.makeDeposit(600);
        acc1.payBill(1000);
        acc1.accrue();
        System.out.println(acc1.toString());
        
    }
}




class BankAccount implements IInterest{
    //Properties of BankAccount
    private static int iD = 1001;                 //Internal ID it has to be static in order to belong to the class
    private String accountNumber;                 //ID + random 2-digit number + first 2 of SSN
    private static final String routingNumber = "005400657";          //Static, it's going to be the case for all objects or accounts
    private String name;
    private String SSN;
    private double balance;
    
    //Add constructors
    public BankAccount(String SSN, double initDeposit){//Every time we create a new account, we increment the ID 
        //System.out.println("NEW ACCOUNT CREATED");
        balance = initDeposit;
        this.SSN = SSN;
        iD++;
        setAccountNumber();
    }
    

    public int getID() {
        return iD;
    }

    public void setID(int ID) {
        this.iD = ID;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber() {
        //Casting
        //flaw located -> random range form 0 - 1; therefore, values <0.1 can be obtained, leading to one digit short
        int random = (int)(Math.random()* 100);
        //System.out.println(random);
        accountNumber = iD + "" + random + "" + SSN.substring(0,2);
        System.out.println("Account Number: " + accountNumber);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void payBill(double amount){
        balance = balance - amount;
        showActivity("transaction of £" + amount);
        showBalance();
    }
    public void makeDeposit(double amount){
        balance = balance + amount; 
        showActivity("deposit of £" + amount);
        showBalance();
    }
    
    public void showBalance(){
        System.out.println("Balance: £" + balance);
    }
    /*
    public void makeWithdrawal(double amount){
        payBill(amount);
    }*/
    public void showActivity(String activity){
        System.out.println("Thank you for making a " + activity + "\nYour new balance is");
    }

    @Override
    public void accrue() {
        balance = balance * (1 + rate/100);
        showBalance();
    }
    
    public String toString(){
        return "[Name: " + name + " ]\n[Account Number: " + accountNumber + "] \n" + "[Routing Number: " + routingNumber + "]\n" + "[Balance: " + balance + "]";
    }
}
