/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;
//Blueprint
class BankAccount implements IRate{
    //Define variables
    
     private String AccountNumber;   //unique to the user
    //static variable
    private static final String routingNumber = "013456";   //has to be the same for each bank account
    //Instance variables
     private String name;
     private String accountType;
     private String SSN;
    private double balance = 0;
    
    //creating a new bank account
    //Define methods
    BankAccount(){
        System.out.println("NEW ACCOUNT CREATED!");
    }
    //Overloading - call same method name with different arguments
    BankAccount(String accountType){
        System.out.println("NEW ACCOUNT: " + accountType);
    }
    BankAccount(String accountType, double intDeposit){
        //intDeposit, accountType, Msgt are all local variables 
        System.out.println("NEW ACCOUNT: " + accountType);
        System.out.println("Initial deposit of: £" + intDeposit);
        String Msg;
        if(intDeposit < 1000){
            Msg = "ERROR: Minimum deposit must be greater than £1000";
        }else{
            Msg = "Thanks for your initial deposit of " + intDeposit;
        }
        System.out.println(Msg);
        balance = intDeposit;
    }
    
    public void deposit(double amount){
        //can be written as: balance += amount
        balance = balance + amount;
        showActivity("DEPOSIT MADE");
    }
    
    void withdraw(double amount){
        balance = balance - amount;
        showActivity("WITHDRAWL MADE");
    }
    
    private void showActivity(String activity){
        System.out.println("Your recent transaction: " + activity);
        System.out.println("Your new balance is : £" + balance);
    }
    
    void checkBalance(){
        System.out.println("Balance: " + balance);
    }
    
    void getStatus(){
        
    }
    @Override
    public String toString(){
        
        return "[ Name: " + name + ", Account #: " + AccountNumber + ", Routing #: " + routingNumber + " BALANCE: £" + balance + " ]";
    }
    
    //  Getters / Setters:
    //Allow the user to define the name
    //we want them to call a function that defines a name
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return "Mr " + name;
        
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
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
    
    //Interface methods
    public void setRate(){
        System.out.println("SETTING RATE");
    }
    
    public void increaseRate(){
        System.out.println("INCREASING RATE");
        
    }
    
    
    
}

/**
 *
 * @author sua2g16
 */
public class BankAccountApp {
    public static void main(String[] args) {
        //When you see the word 'new' >> think instantiating an object
        //creating a new bank account
        //Default constructor
        BankAccount account1 = new BankAccount();
        //Old method
//        account1.AccountNumber = "0156483";
//        account1.name = "Sherif U";
        //New method: Encapsulation:
        account1.setName("Sherif");
        System.out.println(account1.getName());
        account1.setSSN("234234523");
        System.out.println("SSN: " + account1.getSSN());
        
        account1.setRate();
        account1.increaseRate();
        
        account1.setBalance(10000);
        System.out.println(account1.toString());
        account1.deposit(3000);
        account1.deposit(1500);
        account1.withdraw(2000);
        
        
        //Polymorphism through overriding 
        System.out.println(account1.toString());
        
        //Calling a different method based on what's inside (i.e. same constructor but having different arguments
        //Polymorphism via overloading
        BankAccount acc2 = new BankAccount("Checking Account");
        BankAccount acc3 = new BankAccount("Savings Account", 5000);
        
       
        /*
        
        //You don't have to call the method(constructor); it will automatically call it for you
        //2nd constructor
        BankAccount account2 = new BankAccount("Savings account");
        account2.AccountNumber = "033435";
        //3rd constructor
        BankAccount account3 = new BankAccount("Checking account", 2500);
        account3.AccountNumber = "3435343";
        //Routing number will be the same
        account3.checkBalance();
        
        //Demo for inheritance 
        CDAccount cd1 = new CDAccount();
        //won't work -> cd account cannot be converted to bankaccount
        //CDAccount cd2 = new BankAccount();

        cd1.balance = 3000;
        cd1.name = "shico";
        System.out.println(cd1.toString());
        cd1.compound();
        */
    }
    
}
