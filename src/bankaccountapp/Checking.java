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
public class Checking extends Account {
    
    private int debitCardNumber,debitCardPin;
    
    //List the properties of Checking Account
    public Checking(String name,String sSN, double initDeposit){
        super(name,sSN,initDeposit);
        accountNumber = "2"+ accountNumber; 
        setDebitCard();
    }
    
    private void setDebitCard(){
        //Genrate 13digit dc number and Acccess by 6 digit pin
        debitCardNumber = (int)(Math.random()*Math.pow(10, 12));        
        debitCardPin = (int)(Math.random()*Math.pow(10, 5));
        
    }
    
    @Override
    public void setRate(){
        rate = getBaseRate() * 0.15;
    }
    
    public void showInfo(){
        System.out.println("Account Type: Checking");
        super.showInfo();       //to not override the () in Account
        System.out.println(" Checking Account Features"+
                 "\n Debit Card Number: "+debitCardNumber+
                 "\n Debit Card Pin: "+debitCardPin
        );
    }
    
}
