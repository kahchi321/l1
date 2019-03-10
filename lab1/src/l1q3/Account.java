package l1q3;

import java.util.Date;

public class Account {
    private int id=0;
    private double balance=0;
    private double annualInterestRate=0;
    private Date dateCreated;
    
    public Account(){
        dateCreated = new Date();
    }
    
    public Account(int id, double balance, double rate){
        this.id = id;
        this.balance = balance;
        annualInterestRate = rate;
        dateCreated = new Date();
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void setBalance(double bal){
        balance = bal;
    }
    
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    
    public void setAnnualInterestRate(double d){
        annualInterestRate = d;
    }
    
    public Date getDateCreated(){
        return dateCreated;
    }
    
    public double getMonthlyInterestRate(){
        return annualInterestRate / 12;
    }
    
    public double getMonthlyInterest(){
        return getMonthlyInterestRate() / 100.0 * balance;
    }
    
    public void withdraw(double amount){
        if(amount <  balance){
            balance -= amount;
        }
        else{
            System.out.println("Not Enough Balance");
        }
    }
    
    public void deposit(double amount){
        balance += amount;
    }
}
