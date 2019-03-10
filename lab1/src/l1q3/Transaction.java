package l1q3;

import java.util.Date;

/**
 *
 * @author HP
 */
public class Transaction {
    private Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;
    
    public Transaction(char type, double amount, double balance, String description){
        this.type = type;
        amount = amount;
        balance = balance;
        description = description;
        date = new Date();
    }
    
    public Date getDate(){
        return date;
    }
    
   public char getType(){
       return type;
   }
   
   public void setType(char t){
       type = t;
   }
   
   public double getAmount(){
       return amount;
   }
   
   public void setAmount(double amount){
       amount = amount;
   }
   
   public double getBalance(){
       return balance;
   }
   
   public void setBalance(double balance){
       balance = balance;
   }
   
   public String getDescription(){
       return description;
   }
   
   public void setDescription(String description){
       description = description;
   }
   
}
