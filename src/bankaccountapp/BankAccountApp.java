/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccountapp;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Jatin Varlyani
 */
public class BankAccountApp {
    public static void main(String[] args) throws IOException {
        
        
        /*Testing the APPlication
        
        Checking chkacc1 = new Checking("Jatin Varlyani", "987547859", 1500);
        Savings savacc1= new Savings("Pawan Chaturvedi", "895789587",2500);
        savacc1.compound();
        
        chkacc1.showInfo();
        System.out.println("************************\n");
        savacc1.showInfo();
        System.out.println("************************\n");
        
        
        //savacc1.deposit(5000);
        //savacc1.withDraw(300);
        //savacc1.transfer("King", 300);
        */
        
        
        
        //Read a CSV file and create new acocunts based on th data
        List<Account> accounts = new  LinkedList<Account>();
        
        String file = "C:\\Users\\Jatin Varlyani\\Desktop\\JAVA\\Practice\\BankAccountApp\\src\\utilities\\NewBankAccounts.csv";
        
        List<String[]> newAccountHolders =  utilities.CSV.read(file);
        for(String[] accountHolder : newAccountHolders){
            
            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
            
            if(accountType.equals("Savings")){
                System.out.println("Open a Saving Account");
                accounts.add(new Savings(name,sSN,initDeposit));
            }
                
            else if(accountType.equals("Checking")){
                System.out.println("Open a Checking Account");
                accounts.add(new Savings(name,sSN,initDeposit));
            }
                
            else{
                System.out.println("error Reading account type");
            }
                
        }
        //accounts.get(5).showInfo();
        
        for(Account acc : accounts){
            System.out.println("\n *************************************");
            acc.showInfo();
        }
        
        //accounts.get((int)Math.random() * accounts.size()).deposit(10000);
    }
    
}
