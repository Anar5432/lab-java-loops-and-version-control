package org.example;

public abstract class Account {
    private double balance:
    public Account(double balance){
        this.balance = balance;
    }
    public abstract void processDebit(double amount);
    public abstract void processDebit(double amount);
    public  double  getBlanace(){
        return balance;
    }

    public void
}
public class SvingsAcount extends Account{
    public SvingsAcount(double balance){
        public void processDebit(double amount){
            if (amount >getBalance()){
                System.out.println("SavingsAcount ; Rejected debit of " + amount + "---insufience found (balance: " getBalance() + ")");
            }else{
                setBalance(getBlanace()-amount);
                System.out.println("savingsAcoount:  debit "+ amount+ "balance" + getBalance());
            }
        }
        public void processCredit(double amount){
            setBalance(getBlanace() + amount);
            System.out.println("SvingsAcoutn+ " + amount + ""+ getBlanace());

        }
    }
}
