/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccountapp;

/**
 *
 * @author Jatin Varlyani
 */
public abstract class Account implements IBaseRate{
    
    //List the comon propeties for the Savings and the Current account
    private String name,sSN;
    private double balance;
    private static int index = 10000;
    
    protected String accountNumber;
    protected double rate;
    
    
    //Constructor to set the base properties and intialise them
    public Account(String name,String sSN, double initDeposit){
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;
        
        //Set the account number
        index++;
        this.accountNumber = setAccountNumber();
        //getBaseRate();
        setRate();
    }
    
    public abstract void setRate();
    
   
    
    
    //Set the account number ie last 2 digits from sSN and 5 digits index and 3 digit random no
    private String setAccountNumber(){
        String lastTwosSN = sSN.substring(sSN.length()-2, sSN.length());
        int uniqueID = index;
        int randomNumber = (int)(Math.random() * Math.pow(10,3));
        return lastTwosSN + uniqueID + randomNumber;
    }
    
    
    public void compound(){
        double accuredInterest = balance * (rate/100);
        balance += accuredInterest;
        System.out.println("Accured Interest:" + accuredInterest);
        printBalance();
    }
    
    
    
    //List the common methods ie Transactions
    public void showInfo(){
        System.out.println(
                 "Name: " +name+
                 "\nAccount Number: "+accountNumber+
                 "\nBalance: "+balance+
                  "\nRate: "+rate+ "%"
        );
    }
    
    
   public void deposit(double amount){
       balance  += amount;
       System.out.println("Depositing $"+amount);
       printBalance();
   } 
   public void withDraw(double amount){
       balance  -= amount;
       System.out.println("WithDrawing $"+amount);
       printBalance();
   } 
   public void transfer(String toWhere, double amount){
       balance -=amount;
       System.out.println("Transfered $"+amount+" To "+toWhere);
       printBalance();
   } 
   public void printBalance(){
       System.out.println("Your Balance is: $"+balance);
   }
   
   
    
    
    
    
    
    
    
    
    
}
