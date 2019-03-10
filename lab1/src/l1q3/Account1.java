package l1q3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Account1 extends Account{
    private String name;
    private ArrayList<Transaction> transactions =new ArrayList();
    
    public Account1(String name, int id, double balance, double rate){
        super(id, balance, rate);
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String n){
        name = n;
    }
    
    public ArrayList<Transaction> getTransactions(){
        return transactions;
    }
    
    @Override
    public void withdraw(double amount){
        if(this.getBalance() > amount){
            Scanner s = new Scanner(System.in);
            System.out.print("Enter description for deposit: ");
            String de = s.nextLine();
            this.setBalance(this.getBalance() - amount);
            Transaction t = new Transaction('W', amount, this.getBalance(), de);
            transactions.add(t);
        }
        else{
            System.out.println("Not Enough Balance!");
        }
    }
    
    @Override
    public void deposit(double amount){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter description for deposit: ");
        String de = s.nextLine();    
        this.setBalance(this.getBalance() + amount);
        Transaction t = new Transaction('D', amount, this.getBalance(), de);
        transactions.add(t);
    }
    
}
