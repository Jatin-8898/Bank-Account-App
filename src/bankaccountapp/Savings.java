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
public class Savings extends Account{
    
    private int safetyDepositBoxID,safetyDepositBoxKey;
    
    //Contsrcutor
    public Savings(String name, String sSN, double initDeposit){
        super(name,sSN, initDeposit);
         accountNumber = "1"+ accountNumber;
         setSafetyDepositBox();
    }
    
    private void setSafetyDepositBox(){
        //Genrate 3 digit box id and Acccess by 4 digit key
        safetyDepositBoxID = (int)(Math.random()*Math.pow(10, 3));
        safetyDepositBoxKey = (int)(Math.random()*Math.pow(10, 4));
        
    }
    
    /*@Override*/
    public void setRate(){
        rate = getBaseRate() - 0.25;
    }
    
    public void showInfo(){
        System.out.println("Account Type: Savings");
        super.showInfo();
        System.out.println(" Savings Account Features"+
                 "\n Safety Deposit Box ID: "+safetyDepositBoxID+
                 "\n Safety Deposit Box Key: "+safetyDepositBoxKey
        );
    }
    
    
    
}
